package com.prince.user.service.service;

import com.prince.user.service.entity.User;
import com.prince.user.service.repository.UserRepository;
import com.prince.user.service.vo.Department;
import com.prince.user.service.vo.Material;
import com.prince.user.service.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    private final String DEPARTMENT_SERVICE_URL = "http://DEPARTMENT-SERVICE/api/v1/departments/";
    private final String MATERIAL_SERVICE_URL = "http://localhost:8084/api/v1/materials/";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getOneUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            throw new RuntimeException("User Not Found");
        }
        return optionalUser.get();
    }

    @Override
    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findById(userId).get();

        Department department =
                restTemplate.getForObject(DEPARTMENT_SERVICE_URL+user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        System.out.println(user);
        System.out.println(department);

        return vo;
    }

    @Override
    public List<Material> getUserWithMaterials() {

        ResponseTemplateVO vo = new ResponseTemplateVO();
        //User user = userRepository.findById(userId).get();

        ResponseEntity<Material[]> response = restTemplate.getForEntity(MATERIAL_SERVICE_URL, Material[].class);

        return Arrays.asList(response.getBody());
    }
}

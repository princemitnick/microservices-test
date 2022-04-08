package com.prince.material.service.app.service;

import com.prince.material.service.app.entity.Material;
import com.prince.material.service.app.repository.MaterialRepository;
import com.prince.material.service.app.vo.ResponseTemplateVO;
import com.prince.material.service.app.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MaterialServiceImpl implements MaterialService{

    private final String USER_SERVICE_URL = "http://USER-SERVICE/api/v1/users/one/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public Material saveMaterial(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public Material getOneMaterial(Long materialId) {
        Optional<Material> optionalMaterial = materialRepository.findById(materialId);
        if (optionalMaterial.isEmpty())
            throw new RuntimeException("Material Not Found");

        return optionalMaterial.get();
    }

    @Override
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    @Override
    public ResponseTemplateVO getMaterialWithUser(Long userId) {

        User user =
                restTemplate.getForObject(
                USER_SERVICE_URL + userId,
                User.class
        );

        ResponseTemplateVO vo = new ResponseTemplateVO();


        List<Material> materials = materialRepository.getMaterialsByUserId(user.getUserId());
        vo.setUser(user);
        vo.setMaterials(materials);

        System.out.println(user);

        return vo;
    }
}

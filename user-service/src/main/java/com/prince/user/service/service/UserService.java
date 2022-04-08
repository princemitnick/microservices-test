package com.prince.user.service.service;

import com.prince.user.service.entity.User;
import com.prince.user.service.vo.Material;
import com.prince.user.service.vo.ResponseTemplateVO;

import java.util.List;

public interface UserService {

    User createUser(User user);
    List<User> getAllUsers();
    User getOneUser(Long id);

    ResponseTemplateVO getUserWithDepartment(Long userId);

    List<Material> getUserWithMaterials();
}

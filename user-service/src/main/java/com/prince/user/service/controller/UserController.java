package com.prince.user.service.controller;


import com.prince.user.service.entity.User;
import com.prince.user.service.service.UserService;
import com.prince.user.service.vo.Material;
import com.prince.user.service.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User createUser(@RequestBody User user){
        log.info("Inside of Create User Method");
       return  userService.createUser(user);
    }

    @GetMapping("/one/{id}")
    public User getOneUser(@PathVariable("id") Long id){
        log.info("Inside of GetOneUser Method");
        return userService.getOneUser(id);
    }

    @GetMapping
    public List<User> getAllUsers(){
        log.info("Inside of GetAllUser Method");
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside of getUserWithDepartment Method");
        return userService.getUserWithDepartment(userId);
    }

    @GetMapping("/materials")
    public List<Material> getAllMaterials(){
       return userService.getUserWithMaterials();
    }


}

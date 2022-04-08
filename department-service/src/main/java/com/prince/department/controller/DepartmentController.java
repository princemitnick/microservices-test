package com.prince.department.controller;

import com.prince.department.entity.Department;
import com.prince.department.service.DepartmentService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside Save Department method Department Controller");
        return departmentService.createDepartment(department);
    }


    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long id){
        log.info("Inside ");
        return departmentService.findDepartmentById(id);
    }

    @GetMapping
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

}

package com.prince.department.service;

import com.prince.department.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department createDepartment(Department department);
    List<Department> getAllDepartment();
    void deleteDepartment(Department department);
    Department findDepartmentById(Long id);

}

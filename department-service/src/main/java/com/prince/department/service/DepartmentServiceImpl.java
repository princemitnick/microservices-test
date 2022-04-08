package com.prince.department.service;

import com.prince.department.entity.Department;
import com.prince.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements  DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartment(Department department) {

    }

    @Override
    public Department findDepartmentById(Long id) {
        Optional<Department> optionalDepartment = departmentRepository.findById(id);
        if (optionalDepartment.isEmpty())
                throw new RuntimeException("Department not found");

        return optionalDepartment.get();
    }
}

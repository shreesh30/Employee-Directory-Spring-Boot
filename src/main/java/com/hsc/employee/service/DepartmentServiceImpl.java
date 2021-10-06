package com.hsc.employee.service;

import com.hsc.employee.entity.Department;
import com.hsc.employee.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartment(Integer departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public List<Department> addDepartments(List<Department> departments) {
        return  departmentRepository.saveAll(departments);
    }
}

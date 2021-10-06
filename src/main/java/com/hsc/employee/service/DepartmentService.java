package com.hsc.employee.service;

import com.hsc.employee.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department addDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartment(Integer departmentId);

    public List<Department> addDepartments(List<Department> departments);
}

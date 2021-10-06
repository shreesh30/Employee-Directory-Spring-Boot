package com.hsc.employee.controller;

import com.hsc.employee.entity.Department;
import com.hsc.employee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

@PostMapping("/department")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
}

@PostMapping("/departments")
public List<Department> addDepartments(@RequestBody List<Department> departments){
    return departmentService.addDepartments(departments);
}

@GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
    return departmentService.fetchDepartmentList();
}

@GetMapping("/departments/{deptId}")
    public Department fetchDepartment(@PathVariable("deptId") Integer departmentId){
    return departmentService.fetchDepartment(departmentId);
}
}

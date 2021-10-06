package com.hsc.employee.service;

import com.hsc.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee addEmployee(Employee employee);

    Employee getEmployee(Integer employeeId);

    List<Employee> addEmployees(List<Employee> employees);

    Employee updateEmployee(Employee employee);

    public void deleteEmployee(Integer employeeId);
}

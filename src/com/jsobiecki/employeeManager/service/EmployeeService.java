package com.jsobiecki.employeeManager.service;

import com.jsobiecki.employeeManager.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    void saveEmployee(Employee theEmployee);

    Employee getEmployee(int theId);

    void deleteEmployee(int theId);
}

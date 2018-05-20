package com.jsobiecki.employeeManager.dao;

import com.jsobiecki.employeeManager.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getEmployees();

    void saveEmployee(Employee theEmployee);

    Employee getEmployee(int theId);

    void deleteEmployee(int theId);
}

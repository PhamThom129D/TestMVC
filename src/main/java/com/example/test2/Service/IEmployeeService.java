package com.example.test2.Service;

import com.example.test2.Model.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> showAllEmployees();

    void addEmployee(Employee employee);
void updateEmployee(int id,Employee employee);
    void deleteEmployee(int id);
    Employee getEmployeeById(int id);
    List<Employee> getEmployeeByName(String name);

}

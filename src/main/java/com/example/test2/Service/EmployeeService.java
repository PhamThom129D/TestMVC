package com.example.test2.Service;

import com.example.test2.Model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployeeService {
public static final Map<Integer,Employee> employees = new HashMap<>();
    static {
      employees.put(1,new Employee(1,"John1",23,"Nhan vien","CNTT",10000));
      employees.put(2,new Employee(2,"kohn2",24,"Nhan vien","Marketing",12000));
      employees.put(3,new Employee(3,"John3",25,"Nhan vien","CNTT",11000));
        employees.put(4,new Employee(4,"John4",26,"Quan ly","CNTT",15000));
        employees.put(5,new Employee(5,"John5",27,"Quan ly","Marketing",15000));
        employees.put(6,new Employee(6,"John6",24,"Nhan vien","CNTT",9000));
        employees.put(7,new Employee(7,"John7",23,"Nhan vien","Marketing",14000));
        employees.put(8,new Employee(8,"John8",25,"Nhan vien","Marketing",8000));
        employees.put(9,new Employee(9,"John9",23,"Nhan vien","CNTT",5000));

    }
    @Override
    public List<Employee> showAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(),employee);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employees.put(id,employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employees.remove(id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> employeeList = new ArrayList<>();
        for(Employee employee:employees.values()) {
            if(employee.getName().contains(name)) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }
}

package com.example.test2.Controller;

import com.example.test2.Model.Employee;
import com.example.test2.Service.EmployeeService;
import com.example.test2.Service.IEmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/employee")
public class EmployeeServlet extends HttpServlet {
    public IEmployeeService employeeService = new EmployeeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        System.out.println(action);
        if(action == null){
            action = "";
        }
        switch (action){
            case "add" :
                showAddEmployee(req,resp);
                break;
                case "update" :
                    showUpdateEmployee(req,resp);
                    break;
                    case "delete" :
                        deleteEmployeeAction(req,resp);
                        break;
            default:
                showAllEmployee(req, resp);
                break;
        }
    }

    private void deleteEmployeeAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        employeeService.deleteEmployee(id);
        showAllEmployee(req,resp);
    }

    private void showUpdateEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Employee employee = employeeService.getEmployeeById(id);
        req.setAttribute("employee",employee);
        RequestDispatcher dispatcher = req.getRequestDispatcher("view/update.jsp");
        dispatcher.forward(req,resp);
    }
    private void showAddEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("view/add.jsp");
        dispatcher.forward(req,resp);
    }
    private void showAllEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = employeeService.showAllEmployees();
        req.setAttribute("employees",employees);
        RequestDispatcher dispatcher = req.getRequestDispatcher("view/list.jsp");
        dispatcher.forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        System.out.println(action);
        if(action == null){
            action = "";
        }
        switch (action){
            case "add" :
                addEmployeeAction(req,resp);
                break;
                case "update" :
                    updateEmployeeAction(req,resp);
                    break;
        }
    }

    private void updateEmployeeAction(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String role = req.getParameter("role");
        String department = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));
        Employee employee = employeeService.getEmployeeById(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setRole(role);
        employee.setDepartment(department);
        employee.setSalary(salary);
        employeeService.updateEmployee(id,employee);
        resp.sendRedirect("/employee");
    }

    private void addEmployeeAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = (int) (Math.random() * 10000);
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String role = req.getParameter("role");
        String department = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));
        Employee employee = new Employee(id,name,age,role,department,salary);
        employeeService.addEmployee(employee);
        resp.sendRedirect("/employee");
    }
}

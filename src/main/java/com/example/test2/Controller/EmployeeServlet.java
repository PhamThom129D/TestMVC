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
        if(action == null){
            action = "";
        }
        switch (action){
            default:
                showAllEmployee(req, resp);
                break;
        }
    }

    private void showAllEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = employeeService.showAllEmployees();
        req.setAttribute("employees",employees);
        RequestDispatcher dispatcher = req.getRequestDispatcher("view/list.jsp");
        dispatcher.forward(req,resp);
    }
}

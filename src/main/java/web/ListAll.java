package web;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "listAll", value = "/listAll")
public class ListAll extends HttpServlet {
    private EmployeeDao employeeDao;

    public void init() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees;
        try {
            employees = employeeDao.getAll();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("employees", employees);
        req.getRequestDispatcher("listAll.jsp").forward(req, resp);
    }
}
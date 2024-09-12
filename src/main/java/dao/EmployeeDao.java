package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDao {
    void registerEmployee(Employee employee) throws ClassNotFoundException;
    List<Employee> getAll() throws ClassNotFoundException;
}

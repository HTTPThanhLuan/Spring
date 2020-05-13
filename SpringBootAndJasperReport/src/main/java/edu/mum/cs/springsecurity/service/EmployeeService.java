package edu.mum.cs.springsecurity.service;

import edu.mum.cs.springsecurity.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
}

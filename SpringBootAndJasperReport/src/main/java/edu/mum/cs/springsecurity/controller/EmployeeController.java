package edu.mum.cs.springsecurity.controller;

import edu.mum.cs.springsecurity.model.Employee;
import edu.mum.cs.springsecurity.service.EmployeeService;
import edu.mum.cs.springsecurity.service.ReportService;

import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ReportService reportService;
    @GetMapping("/")
    public List<Employee> getEmplyees(){
        return  employeeService.getAll();
    }

    @GetMapping("/report/{format}")
    public String report(@PathVariable String format) throws FileNotFoundException, JRException {
        return  reportService.exportReport(format);
    }
}

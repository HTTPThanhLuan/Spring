package edu.mum.cs.springsecurity.service;

import edu.mum.cs.springsecurity.model.Employee;
import edu.mum.cs.springsecurity.repository.EmployeeRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ReportService {
    @Autowired
 private EmployeeRepository repository;
 public  String exportReport(String reportFormat) throws FileNotFoundException, JRException {
     String path = "C:\\Users\\luant\\OneDrive\\Desktop\\";
     List<Employee> employeeList = toList(repository.findAll());
     //Load jrxml file and compile it
     File file = ResourceUtils.getFile("classpath:parameter.jrxml");
     JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
     JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employeeList);
     Map<String,Object> map=new HashedMap();
     map.put("Parameter1","Java Techie"); //set value to Parameter
     JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport,map, dataSource);
     if(reportFormat.equalsIgnoreCase("html"))
     {
       JasperExportManager.exportReportToHtmlFile(jasperPrint,path+ "employee.html");
     }
     if(reportFormat.equalsIgnoreCase("pdf")){
         JasperExportManager.exportReportToPdfFile(jasperPrint,path+ "employee.pdf");
     }
     return "report";
 }

    public static <T> List<T> toList(final Iterable<T> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }
}

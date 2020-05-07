package thanh.luan.demo.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import thanh.luan.demo.onetomany.domain.CellPhone;
import thanh.luan.demo.onetomany.domain.Employee;
import thanh.luan.demo.onetomany.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/OneToManyUniJoinColumn", method = RequestMethod.GET)
    public ModelAndView doOneToManyUniJoinColumn() {

        List<CellPhone> cellPhones = new ArrayList<CellPhone>();

        CellPhone cellPhone = new CellPhone();
        cellPhone.setAreaCode(222);
        cellPhone.setPrefix(333);
        cellPhone.setNumber(5432);
        cellPhones.add(cellPhone);

        cellPhone = new CellPhone();
        cellPhone.setAreaCode(111);
        cellPhone.setPrefix(444);
        cellPhone.setNumber(2345);
        cellPhones.add(cellPhone);

        Employee employee = new Employee();
        employee.setName("Bill");
        employee.setCellPhones(cellPhones);


        employee = employeeService.save(employee);

        employee = new Employee();
        employee.setName("Bill2");
        employeeService.save(employee);


        employeeService.findEmployeesByName("Bill").stream().forEach(System.out::println);

        ModelAndView mav = new ModelAndView();
        mav.addObject(employee);
        mav.setViewName("onetomany/EmployeeDetails");
        return mav;
    }
}

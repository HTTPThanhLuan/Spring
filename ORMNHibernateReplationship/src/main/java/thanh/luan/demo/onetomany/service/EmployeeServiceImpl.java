package thanh.luan.demo.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanh.luan.demo.onetomany.domain.Employee;
import thanh.luan.demo.onetomany.repository.EmployeeRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee get(Long id) {
        return employeeRepository.findById(id).get();
//		return employeeRepository.findByName(id);
    };

  //  @Override
  //  public List<Employee> findByLastName(String lastName) {
   //     return employeeRepository.findByName(lastName);
   // }

    @Override
    public List<Employee> findEmployeesByName(String name) {
        return employeeRepository.findEmployeesByName(name);
    };
}

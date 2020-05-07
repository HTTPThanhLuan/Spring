package thanh.luan.demo.onetomany.service;

import thanh.luan.demo.onetomany.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();

    public Employee save(Employee employee);

    public Employee get(Long id);

   // public List<Employee> findByLastName(String lastName);

    public List<Employee> findEmployeesByName(String name);
}

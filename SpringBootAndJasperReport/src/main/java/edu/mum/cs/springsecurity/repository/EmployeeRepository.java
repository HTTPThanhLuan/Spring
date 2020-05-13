package edu.mum.cs.springsecurity.repository;

import edu.mum.cs.springsecurity.model.Employee;
import edu.mum.cs.springsecurity.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

package thanh.luan.demo.onetomany.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import thanh.luan.demo.onetomany.domain.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query("select e from Employee e where e.id = :id")
   public Employee findByName(@Param("id") long id);


    @Query(value = "SELECT e FROM Employee e WHERE e.name like %:name%")
    public List<Employee> findByName(String name);

   // List<Employee> findByFirstNameContaining(String firstName);

   // @Query(value = "SELECT * FROM Employee e WHERE e.F_NAME = ?1", nativeQuery = true)
    //public List<Employee> findByFirstName(String firstName);

    public List<Employee> findEmployeesByName(@Param("name") String name);

}

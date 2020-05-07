package thanh.luan.demo.onetomany.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQuery(name = "Employee.findEmployeesByName", query = "SELECT e FROM Employee e WHERE LOWER(e.name) = LOWER(:name)")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMP_ID")
    private long id;

    @Column(name = "NAME")
    @Getter @Setter
    private String name;

    @OneToMany(cascade = CascadeType.ALL) // default create table
    @Fetch(FetchMode.JOIN)
    @JoinColumn
    // tell don't create table, add "PHONES_EMP_ID" column in CellPhone Side, you can custom other name
    @Getter @Setter
    private List<CellPhone> cellPhones;
}


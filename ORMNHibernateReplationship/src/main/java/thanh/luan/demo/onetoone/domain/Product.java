package thanh.luan.demo.onetoone.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter @Getter
    private String name;



    @OneToOne(cascade = CascadeType.ALL) // Default is JoinColumn
    @JoinColumn(name = "phone_id", nullable = false) // custome column name is phone_id instead of hot_line_id
    @Getter @Setter
    private Phone hotLine;


    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name +", hotLine=" + hotLine + "]";
    }
}

package thanh.luan.demo.onetoone.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter @Getter
    private Integer areacode;
    @Setter @Getter
    private Integer number;
    @Setter @Getter
    private Integer prefix;

    public void setProduct(Product product) {
        this.product = product;
    }

  // @OneToOne(cascade = CascadeType.ALL) //// Default is JoinColumn
    @OneToOne(mappedBy = "hotLine", cascade = CascadeType.ALL)
    // mappedBy = "hotLine" tell hibernate don't do anything in my side. In this case is don't create product_Id In CellPhone Table
    @Getter @Setter
    private Product product;


    @Override
    public String toString() {
        return "CellPhone [areacode=" + areacode + ", number=" + number +", prefix=" + prefix + "]";
    }

}

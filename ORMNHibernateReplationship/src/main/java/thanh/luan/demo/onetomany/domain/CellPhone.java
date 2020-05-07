package thanh.luan.demo.onetomany.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CELLPHONE")
public class CellPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "AREA_CODE")
    @Getter @Setter
    private Integer areaCode;

    @Column(name = "P_NUMBER")
    @Getter @Setter
    private Integer number;
    @Getter @Setter
    private Integer prefix;
}

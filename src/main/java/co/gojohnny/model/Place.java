package co.gojohnny.model;

import com.vividsolutions.jts.geom.Point;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;

    @Column
    private String name;

    @Column
    private BigDecimal altitude;

    @Column(nullable = false)
    private Point location;


}

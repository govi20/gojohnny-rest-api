package co.gojohnny.model;

import co.gojohnny.enums.PlaceType;
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

    @Column
    private PlaceType type = PlaceType.UNKNOWN;

    @Column(nullable = false)
    private Point location;

    @Column(name = "photo_url")
    private String photoUrl;
}

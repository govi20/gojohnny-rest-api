package co.gojohnny.model;

import com.vividsolutions.jts.geom.Point;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.SEQUENCE;

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
    private String description;

    @Column
    private BigDecimal altitude;

    @Column(nullable = false, columnDefinition = "geometry")
    private Point location;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "osm_id")
    private Long osmId;
}

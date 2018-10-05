package co.gojohnny.repository;

import co.gojohnny.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface PlaceRepository extends JpaRepository<Place, Long> {

    @RestResource(path = "/name")
    @Query("select p from Place p where p.name like concat('%', :query, '%')")
    List<Place> findPlacesByName(@Param("query") String query);
}

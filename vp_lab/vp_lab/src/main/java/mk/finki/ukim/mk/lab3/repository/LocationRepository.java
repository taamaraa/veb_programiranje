package mk.finki.ukim.mk.lab3.repository;


import mk.finki.ukim.mk.lab3.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {

    List<Location> findByID(long id);

}

package mk.finki.ukim.mk.demo.repository.jpa;

import mk.finki.ukim.mk.demo.model.Event;
import mk.finki.ukim.mk.demo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findAllByNameLike(String text);
    List<Event> findAllByPopularityScoreAndDescription(double score,String text);
    List<Event> findAllById(long id);
    void deleteById(long id);



}

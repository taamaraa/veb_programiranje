package mk.finki.ukim.mk.lab3.service;

import mk.finki.ukim.mk.lab3.model.Event;
import mk.finki.ukim.mk.lab3.model.Location;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> listAll();
    List<Event> searchEvents(String text);
    List<Event> specialSearch(String text,double rating);
    List<Event> find_by_ID(long id);
    void deleteById(long id);
    Optional<Event> save(Event e);
    Optional<Event> update(Long id,String name, String desc, double popularity_score, Location e);
}
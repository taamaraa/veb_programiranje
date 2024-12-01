package mk.finki.ukim.mk.lab3.repository.impl;

import mk.finki.ukim.mk.lab3.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab3.model.Event;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class InMemoryEventRepository {
    public List<Event> findAll(){
        return DataHolder.events;
    }
    public List<Event> searchEvents(String text){
        return DataHolder.events.stream().filter(i->i.getName().contains(text) || i.getDescription().contains(text)).collect(Collectors.toList());
    }
    public List<Event> specialSearch(String text,double rating){
        return DataHolder.events.stream().filter(i->i.getName().contains(text) || i.getPopularityScore()>=rating).collect(Collectors.toList());
    }
    public Optional<Event> find_by_ID(long id){
        return DataHolder.events.stream().filter(i->i.getId()==id).findFirst();
    }
    public Optional<Event> save(Event e){
        DataHolder.events.removeIf(i->i.getName().equals(e.getName()));
        DataHolder.events.add(e);
        return Optional.of(e);
    }

    public void like(Event e){
        e.like();
    }
    public void delete(long ID){
        DataHolder.events.removeIf(i->i.getId()==ID);
    }
}

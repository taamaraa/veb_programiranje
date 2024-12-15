package mk.finki.ukim.mk.demo.repository.inmemory;

import mk.finki.ukim.mk.demo.bootstrap.DataHolder;
import mk.finki.ukim.mk.demo.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryLocationRepository {
    public List<Location> findAll(){
        //return DataHolder.locations.stream().toList();
        return null;
    }
    public Optional<Location> find_by_ID(long id){
       // return DataHolder.locations.stream().filter(i->i.getId().equals(id)).findFirst();
        return null;
    }
}

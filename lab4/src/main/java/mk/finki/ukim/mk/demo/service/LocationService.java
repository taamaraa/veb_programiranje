package mk.finki.ukim.mk.demo.service;

import mk.finki.ukim.mk.demo.model.Location;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    public List<Location> findAll();
    public List<Location> find_by_ID(long id);
}

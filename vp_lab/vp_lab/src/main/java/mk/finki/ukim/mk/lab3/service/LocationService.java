package mk.finki.ukim.mk.lab3.service;

import mk.finki.ukim.mk.lab3.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    public List<Location> findAll();
    List<Location> find_by_ID(long id);
}

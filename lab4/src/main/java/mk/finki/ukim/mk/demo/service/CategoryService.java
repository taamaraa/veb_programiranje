package mk.finki.ukim.mk.demo.service;

import mk.finki.ukim.mk.demo.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();
    Optional<Category> findById(long id);
}

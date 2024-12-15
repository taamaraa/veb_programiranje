package mk.finki.ukim.mk.demo.service.impl;

import mk.finki.ukim.mk.demo.model.Category;
import mk.finki.ukim.mk.demo.repository.jpa.CategoryRepository;
import mk.finki.ukim.mk.demo.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(long id) {
        return Optional.of(categoryRepository.findById(id).get());
    }
}

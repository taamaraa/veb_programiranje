package mk.finki.ukim.mk.demo.repository.jpa;

import mk.finki.ukim.mk.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findById(long id);
}

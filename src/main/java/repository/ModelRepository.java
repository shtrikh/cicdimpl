package repository;

import entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
    // Метод для пошуку за id
    Model findModelById(Long id);
}


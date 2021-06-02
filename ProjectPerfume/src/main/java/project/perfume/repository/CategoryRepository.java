package project.perfume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.perfume.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

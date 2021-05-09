package project.perfume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.perfume.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}

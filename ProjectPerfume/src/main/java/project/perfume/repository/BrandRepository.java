package project.perfume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.perfume.entities.Brand;

public interface BrandRepository  extends JpaRepository<Brand, Integer>{

}

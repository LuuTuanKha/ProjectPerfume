package project.perfume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.perfume.entities.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}

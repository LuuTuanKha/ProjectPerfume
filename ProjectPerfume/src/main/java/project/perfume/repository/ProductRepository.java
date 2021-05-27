package project.perfume.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import project.perfume.entities.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>,JpaRepository<Product, Integer> {
	@Query("select p from Product p ORDER BY p.sellPrice ASC")
	List<Product> findAllByOrderBySellPriceASC();
//	List<Product> findAllByOrderByProductNameASC();
	
	

	

}

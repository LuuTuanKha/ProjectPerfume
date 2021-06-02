package project.perfume.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.perfume.entities.SalesOrderHeader;
import project.perfume.entities.User;

public interface SaleOrderHeaderRepository extends JpaRepository<SalesOrderHeader, Integer>{
	SalesOrderHeader save(SalesOrderHeader sale);
	List<SalesOrderHeader> findByCustomer(User cus);
}

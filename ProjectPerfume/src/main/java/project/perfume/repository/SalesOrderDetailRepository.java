package project.perfume.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.perfume.entities.SalesOrderDetail;
import project.perfume.entities.SalesOrderDetail_PK;

public interface SalesOrderDetailRepository extends JpaRepository<SalesOrderDetail, SalesOrderDetail_PK> {
	List<SalesOrderDetail> findByPkSaleOrderHeaderID(Integer id);
	
}

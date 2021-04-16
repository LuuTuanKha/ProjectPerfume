package project.perfume.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SalesOrderDetails")
public class SalesOrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private Integer productId;
	private Integer orderQty;
	@OneToOne
	private SalesOrderHeader saleOrderHeader;

}
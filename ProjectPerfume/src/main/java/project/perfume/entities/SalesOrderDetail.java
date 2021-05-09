package project.perfume.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SalesOrderDetails")
public class SalesOrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer salesOrderDetailId;

	@ManyToMany(mappedBy = "saleOrderDetail")
	private Set<Product> products;
	private Integer orderQty;
	@OneToOne
	private SalesOrderHeader saleOrderHeader;

}
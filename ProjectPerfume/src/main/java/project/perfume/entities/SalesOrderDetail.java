package project.perfume.entities;

import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SalesOrderDetails")

@EqualsAndHashCode(of = "pk")
//@IdClass(SalesOrderDetail_PK.class)
public class SalesOrderDetail {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer salesOrderDetailId;
	@EmbeddedId
	private SalesOrderDetail_PK pk;
//	@Id
//	private String saleOrderHeaderID;
//	@Id
//	private String masanpham;
	
	
	private Integer orderQty;
	
	@ManyToOne
	@JoinColumn(name = "saleOrderHeaderID")
	@MapsId("saleOrderHeaderID")
	private SalesOrderHeader saleOrderHeader;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	@MapsId("productId")
	private Product product;

}
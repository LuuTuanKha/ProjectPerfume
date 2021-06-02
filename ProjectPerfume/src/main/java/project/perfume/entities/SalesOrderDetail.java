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
	private Double sellPrice;
	@ManyToOne
	@JoinColumn(name = "saleOrderHeaderID")
	@MapsId("saleOrderHeaderID")
	private SalesOrderHeader saleOrderHeader;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	@MapsId("productId")
	private Product product;

	public SalesOrderDetail(SalesOrderDetail_PK pk, Integer orderQty, Double sellPrice,
			SalesOrderHeader saleOrderHeader, Product product) {
		super();
		this.pk = pk;
		this.orderQty = orderQty;
		this.sellPrice = sellPrice;
		this.saleOrderHeader = saleOrderHeader;
		this.product = product;
	}

	public SalesOrderDetail() {
		super();
	}

	public SalesOrderDetail_PK getPk() {
		return pk;
	}

	public void setPk(SalesOrderDetail_PK pk) {
		this.pk = pk;
	}

	public Integer getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(Integer orderQty) {
		this.orderQty = orderQty;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public SalesOrderHeader getSaleOrderHeader() {
		return saleOrderHeader;
	}

	public void setSaleOrderHeader(SalesOrderHeader saleOrderHeader) {
		this.saleOrderHeader = saleOrderHeader;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
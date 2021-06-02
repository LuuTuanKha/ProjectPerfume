package project.perfume.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "Carts")
@EqualsAndHashCode(of = "pk")
public class Cart {
	@EmbeddedId
	private Cart_PK pk;
//	@Id
//	private String saleOrderHeaderID;
//	@Id
//	private String masanpham;

	private Integer orderQty;
	private Double sellPrice;

	@ManyToOne
	@JoinColumn(name = "productId")
	@MapsId("productId")
	private Product product;
	@ManyToOne
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cart() {
		super();
	}

	public Cart_PK getPk() {
		return pk;
	}

	public void setPk(Cart_PK pk) {
		this.pk = pk;
	}

	public Integer getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(Integer orderQty) {
		this.orderQty = orderQty;
	}

	public Double getSellPrice() {
		return  product.getSellPrice()*orderQty;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = product.getSellPrice()*orderQty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart(Cart_PK pk, Integer orderQty, Double sellPrice, Product product, User user) {
	
		this.pk = pk;
		this.orderQty = orderQty;
		this.sellPrice = sellPrice;
		this.product = product;
		this.user = user;
	}
	

}

package project.perfume.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Entity
@Table(name = "SalesOrderHeaders")
@Data
@EqualsAndHashCode(of = "saleOrderHeaderID")
public class SalesOrderHeader {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Id Integer saleOrderHeaderID;
	//	private ShipDetail shipDetail;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "saleOrderHeader", fetch = FetchType.LAZY)
	private List<SalesOrderDetail> saleOrderDetails;
	
	@OneToOne(mappedBy = "saleOrderHeader", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private ShipDetail shipDetail;
	
	@ManyToOne
	@JoinColumn(name = "saleOrderHeader", nullable = false)
	private User customer;
	private Date orderDate;
	//private Date shipDate;
	private double subTotal;
	private String comments;
	private Date dueDate;
	public Integer getSaleOrderHeaderID() {
		return saleOrderHeaderID;
	}
	public void setSaleOrderHeaderID(Integer saleOrderHeaderID) {
		this.saleOrderHeaderID = saleOrderHeaderID;
	}
	public List<SalesOrderDetail> getSaleOrderDetails() {
		return saleOrderDetails;
	}
	public void setSaleOrderDetails(List<SalesOrderDetail> saleOrderDetails) {
		this.saleOrderDetails = saleOrderDetails;
	}
	public ShipDetail getShipDetail() {
		return shipDetail;
	}
	public void setShipDetail(ShipDetail shipDetail) {
		this.shipDetail = shipDetail;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Date getOrderDate() {
		return new Date(new java.util.Date().getTime());
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	

}
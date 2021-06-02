package project.perfume.dto;

import java.util.Date;
import java.util.List;

import project.perfume.entities.SalesOrderDetail;
import project.perfume.entities.User;

public class SaleOrderHeaderDTO extends AbstractDTO<ProductDTO> {

	private List<SalesOrderDetail> saleOrderDetails;
	
	private User customer;
	private Date orderDate;
	
	public List<SalesOrderDetail> getSaleOrderDetails() {
		return saleOrderDetails;
	}
	public void setSaleOrderDetails(List<SalesOrderDetail> saleOrderDetails) {
		this.saleOrderDetails = saleOrderDetails;
	}
	
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Date getOrderDate() {
		return orderDate;
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
	private double subTotal;
	private String comments;
	private Date dueDate;
}

package project.perfume.entities;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name = "SalesOrderHeaders")
public class SalesOrderHeader {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderHeaderId;
	//	private ShipDetail shipDetail;
	@OneToOne(mappedBy = "saleOrderHeader", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private SalesOrderDetail saleOrderDetail;
	@OneToOne(mappedBy = "saleOrderHeader", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private ShipDetail shipDetail;
	@ManyToOne
	@JoinColumn(name = "saleOrderheader", nullable = false)
	private Customer customer;
	private Date orderDate;
	//private Date shipDate;
	private double subTotal;
	private String comments;
	private Date dueDate;

}
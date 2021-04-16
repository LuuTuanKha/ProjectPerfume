package project.perfume.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "ShipDetails")
public class ShipDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shipId;
	private String status;
	private double shipPrice;
	private Date time;
	@OneToOne
	private SalesOrderHeader saleOrderHeader;

}
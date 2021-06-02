package project.perfume.dto;

import java.util.Date;

import project.perfume.entities.SalesOrderHeader;

public class ShipDetailDTO extends AbstractDTO<ProductDTO>{
	private String status;
	private double shipPrice;
	private Date time;
	private SalesOrderHeader saleOrderHeader;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getShipPrice() {
		return shipPrice;
	}
	public void setShipPrice(double shipPrice) {
		this.shipPrice = shipPrice;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public SalesOrderHeader getSaleOrderHeader() {
		return saleOrderHeader;
	}
	public void setSaleOrderHeader(SalesOrderHeader saleOrderHeader) {
		this.saleOrderHeader = saleOrderHeader;
	}
	
}

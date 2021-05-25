package project.perfume.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class SalesOrderDetail_PK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer saleOrderHeaderID;
	private Integer productId;
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	

}

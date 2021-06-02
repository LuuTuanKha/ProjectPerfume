package project.perfume.entities;
import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class Cart_PK implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private Integer productId;
	
	
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Cart_PK() {
		super();
	}
	public Cart_PK(String username, Integer productId) {
		super();
		this.username = username;
		this.productId = productId;
	}
	
	
	
	

}
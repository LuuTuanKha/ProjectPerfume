package project.perfume.dto;

import project.perfume.entities.User;

public class AddressDTO extends AbstractDTO<ProductDTO> {
	
	private String addressName;	
	private User customer;
	
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
}

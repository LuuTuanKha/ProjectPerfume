package project.perfume.dto;

import java.util.Set;

import project.perfume.entities.Product;

public class SupplierDTO extends AbstractDTO<ProductDTO>{
	private String supplierName;
	private Set<Product> listProduct;
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Set<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(Set<Product> listProduct) {
		this.listProduct = listProduct;
	}
}

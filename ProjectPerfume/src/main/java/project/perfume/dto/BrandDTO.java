package project.perfume.dto;

import java.util.List;

import project.perfume.entities.Product;

public class BrandDTO extends AbstractDTO<ProductDTO> {
	private String brandName;
	private List<Product> product;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
}

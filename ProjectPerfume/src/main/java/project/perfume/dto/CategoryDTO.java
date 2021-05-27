package project.perfume.dto;

import java.util.Set;

import project.perfume.entities.Product;

public class CategoryDTO extends AbstractDTO<ProductDTO> {

	private String sex;
	private String categoryName;

	private Set<Product> listProducts;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(Set<Product> listProducts) {
		this.listProducts = listProducts;
	}

}

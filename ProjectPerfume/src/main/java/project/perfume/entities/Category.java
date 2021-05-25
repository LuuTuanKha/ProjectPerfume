package project.perfume.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoryId;
	
	private String sex;
	private String categoryName;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "category")
	private Set<Product> listProducts;
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
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
	public Category(String sex, String categoryName, Set<Product> listProducts) {
		super();
		this.sex = sex;
		this.categoryName = categoryName;
		this.listProducts = listProducts;
	}
	public Category() {
		super();
	}
	
	

}
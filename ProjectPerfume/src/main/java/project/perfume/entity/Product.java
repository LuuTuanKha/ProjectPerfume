package project.perfume.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private int product_name;
	private int quantity;
	private int price;
	private int description;
	private int size;
	private int brand;
	private int manufacturingDate;
	private int expiryDate;
	private int madeIn;
	private int categoryId;
	private int sellPrice;
	private int saleID;
	private int ingredientsListing;
	private int status;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "Products_Categories", 
	joinColumns =  @JoinColumn(name = "productId"),
	inverseJoinColumns = @JoinColumn(name = "categoryId"))
	private Set<Category> categories;
	public int getProduct_name() {
		return product_name;
	}
	public void setProduct_name(int product_name) {
		this.product_name = product_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public int getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(int manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public int getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(int madeIn) {
		this.madeIn = madeIn;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getSaleID() {
		return saleID;
	}
	public void setSaleID(int saleID) {
		this.saleID = saleID;
	}
	public int getIngredientsListing() {
		return ingredientsListing;
	}
	public void setIngredientsListing(int ingredientsListing) {
		this.ingredientsListing = ingredientsListing;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	

}
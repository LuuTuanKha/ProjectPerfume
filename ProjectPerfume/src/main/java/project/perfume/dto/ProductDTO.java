package project.perfume.dto;

import java.sql.Date;

import project.perfume.entities.Brand;
import project.perfume.entities.Category;
import project.perfume.entities.Supplier;

public class ProductDTO extends AbstractDTO<ProductDTO>{
	private String productName;
	private Integer quantity; //Số lượng
	private Integer selledQTT; //Sá»‘ lÆ°á»£ng sáº£n pháº©m Ä‘Ã£ bÃ¡n
	
	private String description;
	private Integer size;
	//private String brand;
	private String manufacturingDate;
	private Date expiryDate; //NgÃ y háº¿t háº¡n
	private String madeIn;
	private Double buyPrice; //GiÃ¡ mua vÃ o (giÃ¡ nháº­p)
	private Double sellPrice; //GiÃ¡ bÃ¡n ra (cho khÃ¡ch hÃ ng)
	private Integer ingredientsListing;
	private Integer status; // 0 - háº¿t hÃ ng 1- ngá»«ng kinh doand
	private String image;
	private Boolean sex;
	private Category category;
	private Supplier supplier;
	private Brand brand;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getSelledQTT() {
		return selledQTT;
	}
	public void setSelledQTT(Integer selledQTT) {
		this.selledQTT = selledQTT;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	public Double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public Integer getIngredientsListing() {
		return ingredientsListing;
	}
	public void setIngredientsListing(Integer ingredientsListing) {
		this.ingredientsListing = ingredientsListing;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
}

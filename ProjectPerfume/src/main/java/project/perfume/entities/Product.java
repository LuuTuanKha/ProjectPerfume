package project.perfume.entities;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	@Column(columnDefinition = "nvarchar(max)")
	private String productName;
	private Integer quantity; //Số lượng
	private Integer selledQTT; //Sá»‘ lÆ°á»£ng sáº£n pháº©m Ä‘Ã£ bÃ¡n
	@Column(columnDefinition = "nvarchar(max)")
	private String description;
	private Integer size;
	//private String brand;
	@Column(columnDefinition = "nvarchar(max)")
	private String manufacturingDate;
	private Date expiryDate; //NgÃ y háº¿t háº¡n
	private String madeIn;
	private Double buyPrice; //GiÃ¡ mua vÃ o (giÃ¡ nháº­p)
	private Double sellPrice; //GiÃ¡ bÃ¡n ra (cho khÃ¡ch hÃ ng)
	private Integer ingredientsListing;
	private Integer status; // 0 - háº¿t hÃ ng 1- ngá»«ng kinh doand
	private String image;
	private Boolean sex;
	@ManyToOne
	@JoinColumn(name = "listProducts", nullable = true)
	private Category category;
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private Set<SalesOrderDetail> saleOrderDetail;
	
	@ManyToOne
	@JoinColumn(name = "listProductOfSupplier", nullable = false)
	private Supplier supplier;
	@ManyToOne
	@JoinColumn(name = "listProductOfBrand", nullable = false)
	private Brand brand;
	
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
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
	
	public Set<SalesOrderDetail> getSaleOrderDetail() {
		return saleOrderDetail;
	}
	public void setSaleOrderDetail(Set<SalesOrderDetail> saleOrderDetail) {
		this.saleOrderDetail = saleOrderDetail;
	}
	
	public Product() {
		super();
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	

}
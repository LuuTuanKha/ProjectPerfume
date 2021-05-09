package project.perfume.entities;

import java.sql.Date;
import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	@Column(columnDefinition = "nvarchar(max)")
	private String productName;
	private Integer quantity; //Số lượng sản phẩm còn
	private Integer selledQTT; //Số lượng sản phẩm đã bán
	@Column(columnDefinition = "nvarchar(max)")
	private String description;
	private Integer size;
	//private String brand;
	@Column(columnDefinition = "nvarchar(max)")
	private String manufacturingDate;
	private Date expiryDate;
	private String madeIn;
	private Double buyPrice;
	private Double sellPrice;
	private Integer saleID;
	private Integer ingredientsListing;
	private Integer status; // 0 - hết hàng 1- ngừng kinh doand
	private String image;
	@ManyToMany(fetch = FetchType.LAZY,cascade = { CascadeType.ALL })
	@JoinTable(name = "Products_Categories", 
	joinColumns =  @JoinColumn(name = "productId"),
	inverseJoinColumns = @JoinColumn(name = "categoryId"))
	private Set<Category> categories;
	@ManyToMany(fetch = FetchType.LAZY,cascade = { CascadeType.ALL })
	@JoinTable(name = "Products_SaleOrderDetais", 
	joinColumns =  @JoinColumn(name = "productId"),
	inverseJoinColumns = @JoinColumn(name = "salesOrderDetailId"))
	private Set<SalesOrderDetail> saleOrderDetail;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
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
	public Integer getSaleID() {
		return saleID;
	}
	public void setSaleID(Integer saleID) {
		this.saleID = saleID;
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
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	public Set<SalesOrderDetail> getSaleOrderDetail() {
		return saleOrderDetail;
	}
	public void setSaleOrderDetail(Set<SalesOrderDetail> saleOrderDetail) {
		this.saleOrderDetail = saleOrderDetail;
	}
	public Product(String productName, Integer quantity, Integer selledQTT, String description, int size,
			String manufacturingDate, Date expiryDate, String madeIn, Double buyPrice, Double sellPrice, Integer saleID,
			Integer ingredientsListing, Integer status, String image, Set<Category> categories,
			Set<SalesOrderDetail> saleOrderDetail) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.selledQTT = selledQTT;
		this.description = description;
		this.size = size;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.madeIn = madeIn;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.saleID = saleID;
		this.ingredientsListing = ingredientsListing;
		this.status = status;
		this.image = image;
		this.categories = categories;
		this.saleOrderDetail = saleOrderDetail;
	}
	public Product() {
		super();
	}
	
	

}
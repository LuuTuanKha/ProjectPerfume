package project.perfume.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	@Column(columnDefinition = "nvarchar(max)")
	private String name;
	private String phone;
	@Column(columnDefinition = "nvarchar(max)")
	private String adress;
	private String sex;
	private Integer age;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "customer")
	private Set<SalesOrderHeader> saleOrderHeader;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "customer")
	private Set<Address> adresses;
	
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Account account;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Set<SalesOrderHeader> getSaleOrderHeader() {
		return saleOrderHeader;
	}
	public void setSaleOrderHeader(Set<SalesOrderHeader> saleOrderHeader) {
		this.saleOrderHeader = saleOrderHeader;
	}
	public Set<Address> getAdresses() {
		return adresses;
	}
	public void setAdresses(Set<Address> adresses) {
		this.adresses = adresses;
	}
	protected Customer() {
		super();
	}
	protected Customer(String name, String phone, String adress, String sex, Integer age,
			Set<SalesOrderHeader> saleOrderHeader, Set<Address> adresses) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
		this.adress = adress;
		this.sex = sex;
		this.age = age;
		this.saleOrderHeader = saleOrderHeader;
		this.adresses = adresses;
	}
	
	
	

}
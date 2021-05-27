package project.perfume.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User  {
	
	@Id
	@Column(name = "username")
	private String userName;	
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "status", nullable = false)
	private Integer status;
	private String email;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "roleid"))
	private List<Role> roles = new ArrayList<>();
	private String fullName;
	private String sex;
	private Integer age;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "customer")
	private Set<SalesOrderHeader> saleOrderHeader;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "customer")
	private Set<Address> adresses;
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public User() {

	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
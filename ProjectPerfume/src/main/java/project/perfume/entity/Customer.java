package project.perfume.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	private String name;
	private String phone;
	private String adress;
	private String sex;
	private Integer age;
	@OneToMany(mappedBy = "customer")
	private Set<SalesOrderHeader> saleOrderHeader;
	@OneToMany(mappedBy = "customer")
	private Set<Address> adresses;

}
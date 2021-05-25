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
@Table(name = "Suppliers") // Nhà cung cấp
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer supplierId;
	private String supplierName;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "supplier")
	private Set<Product> listProduct;
	
	
	

}

package project.perfume.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VietNamAdress")
public class VietNamAdress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(columnDefinition = "nvarchar(50)",name = "tinhTP")
	private String cityOrProvice;
	
	@Column(columnDefinition = "nvarchar(50)",name = "quanHuyen")
	private String DistrictOrTown;
	
	@Column(columnDefinition = "nvarchar(50)",name="phuongXa")
	private String subDistrictOrVillage;
	public String getCityOrProvice() {
		return cityOrProvice;
	}
	public void setCityOrProvice(String cityOrProvice) {
		this.cityOrProvice = cityOrProvice;
	}
	public String getDistrictOrTown() {
		return DistrictOrTown;
	}
	public void setDistrictOrTown(String districtOrTown) {
		DistrictOrTown = districtOrTown;
	}
	public String getSubDistrictOrVillage() {
		return subDistrictOrVillage;
	}
	public void setSubDistrictOrVillage(String subDistrictOrVillage) {
		this.subDistrictOrVillage = subDistrictOrVillage;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public VietNamAdress(Integer id, String cityOrProvice, String districtOrTown, String subDistrictOrVillage) {
		super();
		this.id = id;
		this.cityOrProvice = cityOrProvice;
		DistrictOrTown = districtOrTown;
		this.subDistrictOrVillage = subDistrictOrVillage;
	}
	public VietNamAdress() {
		super();
	}
	
	
}

package project.perfume.dto;

public class EmployeeDTO extends AbstractDTO<ProductDTO> {
	private String password;
	private String status;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

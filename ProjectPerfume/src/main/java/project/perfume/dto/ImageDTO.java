package project.perfume.dto;

public class ImageDTO extends AbstractDTO<ProductDTO> {
	private Integer productId;
	private Integer Value;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getValue() {
		return Value;
	}
	public void setValue(Integer value) {
		Value = value;
	}
	
}

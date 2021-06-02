package project.perfume.dto;

public class SaleOrderDetailDTO extends AbstractDTO<ProductDTO> {
	private Integer orderQty;

	public Integer getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(Integer orderQty) {
		this.orderQty = orderQty;
	} 
	
}

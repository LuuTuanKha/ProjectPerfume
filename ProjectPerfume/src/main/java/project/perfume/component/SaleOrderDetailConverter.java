package project.perfume.component;

import org.modelmapper.ModelMapper;

import project.perfume.dto.SaleOrderDetailDTO;
import project.perfume.entities.SalesOrderDetail;

public class SaleOrderDetailConverter {
	
	public SaleOrderDetailDTO toDto(SalesOrderDetail salesOrderDetail) {
		ModelMapper modelMapper = new ModelMapper();
		SaleOrderDetailDTO dto = modelMapper.map(salesOrderDetail, SaleOrderDetailDTO.class);
		System.out.println("id"+ dto.getId());
		return dto;
		
	}
}

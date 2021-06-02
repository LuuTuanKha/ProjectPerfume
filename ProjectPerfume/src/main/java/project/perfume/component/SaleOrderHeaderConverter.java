package project.perfume.component;

import org.modelmapper.ModelMapper;

import project.perfume.dto.SaleOrderHeaderDTO;
import project.perfume.entities.SalesOrderHeader;

public class SaleOrderHeaderConverter {
	
	public SaleOrderHeaderDTO toDto(SalesOrderHeader salesOrderHeader) {
		ModelMapper modelMapper = new ModelMapper();
		SaleOrderHeaderDTO dto = modelMapper.map(salesOrderHeader, SaleOrderHeaderDTO.class);
		System.out.println("id"+ dto.getId());
		return dto;
		
	}
}

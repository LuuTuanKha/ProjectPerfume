package project.perfume.component;

import org.modelmapper.ModelMapper;

import project.perfume.dto.SupplierDTO;
import project.perfume.entities.Supplier;

public class SupplierConverter {
	public SupplierDTO toDto(Supplier supplier) {
		ModelMapper modelMapper = new ModelMapper();
		SupplierDTO dto = modelMapper.map(supplier, SupplierDTO.class);
		System.out.println("id"+ dto.getId());
		return dto;
		
	}
}

package project.perfume.component;

import org.modelmapper.ModelMapper;

import project.perfume.dto.BrandDTO;
import project.perfume.entities.Brand;

public class BrandConverter {
	public BrandDTO toDto(Brand brand) {
		ModelMapper modelMapper = new ModelMapper();
		BrandDTO dto = modelMapper.map(brand, BrandDTO.class);
		System.out.println("id"+ dto.getId());
		return dto;
		
	}
}

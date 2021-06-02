package project.perfume.component;

import org.modelmapper.ModelMapper;

import project.perfume.dto.AddressDTO;
import project.perfume.entities.Address;


public class AddressConverter {
	public AddressDTO toDto(Address address) {
		ModelMapper modelMapper = new ModelMapper();
		AddressDTO dto = modelMapper.map(address, AddressDTO.class);
		System.out.println("id"+ dto.getId());
		return dto;
		
	}
	
}

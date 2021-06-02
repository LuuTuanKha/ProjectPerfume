package project.perfume.component;

import org.modelmapper.ModelMapper;

import project.perfume.dto.ImageDTO;
import project.perfume.entities.Image;

public class ImageConverter {
	
	public ImageDTO  toDto(Image image) {
		ModelMapper modelMapper = new ModelMapper();
		ImageDTO dto = modelMapper.map(image, ImageDTO.class);
		System.out.println("id"+ dto.getId());
		return dto;
		
	}
}

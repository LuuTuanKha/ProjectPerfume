package project.perfume.component;

import org.modelmapper.ModelMapper;

import project.perfume.dto.CategoryDTO;
import project.perfume.entities.Category;

public class CategoryConverter {
	public CategoryDTO toDto(Category category) {
		ModelMapper modelMapper = new ModelMapper();
		CategoryDTO dto = modelMapper.map(category, CategoryDTO.class);
		System.out.println("id"+ dto.getId());
		return dto;
		
	}
}

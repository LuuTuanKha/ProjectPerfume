package project.perfume.component;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import project.perfume.dto.ProductDTO;
import project.perfume.entities.Product;

@Component
public class ProductConverter {
//	public ProductDTO toDto(Product entity) {
//		ProductDTO dto = new ProductDTO();
//		dto.setId(entity.getProductId());
//		dto.setSelledQTT(entity.getSelledQTT());
//		dto.setProductName(entity.getProductName());
//		dto.setQuantity(entity.getQuantity());
//		dto.setDescription(entity.getDescription());
//		dto.setSize(entity.getSize());
//		dto.setManufacturingDate(entity.getManufacturingDate());
//		dto.setExpiryDate(entity.getExpiryDate());
//		dto.setMadeIn(entity.getMadeIn());
//		dto.setBuyPrice(entity.getBuyPrice());
//		dto.setSellPrice(entity.getSellPrice());
//		dto.setIngredientsListing(entity.getIngredientsListing());;
//		dto.setStatus(entity.getStatus());
//		dto.setImage(entity.getImage());
//		dto.setSex(entity.getSex());
//		
//		return dto;
//		
//	}
	public ProductDTO toDto(Product product) {
		ModelMapper modelMapper = new ModelMapper();
		ProductDTO dto = modelMapper.map(product, ProductDTO.class);
		return dto;
		
	}

}

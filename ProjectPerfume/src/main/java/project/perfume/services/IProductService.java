package project.perfume.services;

import java.util.List;

import org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort;
import org.springframework.data.domain.Pageable;

import project.perfume.dto.ProductDTO;



public interface IProductService {
	List<ProductDTO> findAll(Pageable pageable);
	List<ProductDTO> findAll();
	int getTotalItem();
	ProductDTO findById(Integer id);
	ProductDTO save(ProductDTO dto);
	void delete(Integer[] ids);
	List<ProductDTO> findAllSortByPrice(Pageable pageable);
	
	

}

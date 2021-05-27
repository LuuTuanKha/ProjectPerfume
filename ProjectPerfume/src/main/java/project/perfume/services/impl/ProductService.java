package project.perfume.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import project.perfume.component.ProductConverter;
import project.perfume.dto.ProductDTO;
import project.perfume.entities.Product;
import project.perfume.repository.ProductRepository;
import project.perfume.services.IProductService;

@Service
public class ProductService implements IProductService {
	@Autowired
	ProductRepository repo;
	@Autowired
	ProductConverter converter;
	
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public List<Product> listAll() {
		return (List<Product>) repo.findAll();
	}
	
	public Product get(Integer id) {
		return repo.findOne(id);
	}
	
	public void delete(Integer id) {
		repo.delete(id);
	}
	
	public List<Product> search(String keyword) {
		return null;
	}
	//DTO

	@Override
	public List<ProductDTO> findAll(Pageable pageable) {
		List<ProductDTO> models = new ArrayList<>();
		List<Product> entities = repo.findAll(pageable).getContent();
		for (Product item: entities) {
			ProductDTO ProductDTO = converter.toDto(item);
			models.add(ProductDTO);
		}
		return models;
	}



	@Override
	public ProductDTO save(ProductDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductDTO findById(Integer id) {
		Product product = repo.getOne(id);
		return converter.toDto(product);
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return (int)repo.count();
	}

	@Override
	public List<ProductDTO> findAll() {
		// TODO Auto-generated method stub
		List<ProductDTO> models = new ArrayList<>();
		List<Product> entities = repo.findAll();
		
		for (Product item: entities) {
			ProductDTO ProductDTO = converter.toDto(item);
			models.add(ProductDTO);
		}
		return models;
	}

	@Override
	public List<ProductDTO> findAllSortByPrice(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}

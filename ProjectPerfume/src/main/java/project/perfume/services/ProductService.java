package project.perfume.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.perfume.entities.Product;
import project.perfume.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	ProductRepository repo;
	public void save(Product product) {
		repo.save(product);
	}
	
	public List<Product> listAll() {
		return (List<Product>) repo.findAll();
	}
	
	public Product get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public List<Product> search(String keyword) {
		return null;
	}

}

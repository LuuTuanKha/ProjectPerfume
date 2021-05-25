package project.perfume.api.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.perfume.entities.Product;
import project.perfume.repository.ProductRepository;


@RestController(value = "ProductAPI-ADMIN")
public class ProductAPI {
	
	@Autowired
	ProductRepository productRepo;
	
	@PostMapping("/api/product")
	public Product createNew(@RequestBody Product product) {
		return productRepo.saveAndFlush(product);
	}
	
	@PutMapping("/api/product")
	public Product updateProduct(@RequestBody Product product) {
		return productRepo.saveAndFlush(product);
	}
	
	@DeleteMapping("/api/product")
	public void deleteProduct(@RequestBody Integer[] ids) {
		System.out.println("ok");
	}
	@GetMapping("/api/product")
	public List<Product> delProduct() {
		return productRepo.findAll();
	}

}

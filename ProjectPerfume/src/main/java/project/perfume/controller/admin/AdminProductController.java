package project.perfume.controller.admin;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.perfume.entities.Brand;
import project.perfume.entities.Product;
import project.perfume.repository.BrandRepository;
import project.perfume.repository.CategoryRepository;
import project.perfume.repository.ProductRepository;
import project.perfume.repository.SupplierRepository;

@Controller
public class AdminProductController {
	@Autowired
	private ProductRepository repo;
	
	@Autowired
	private BrandRepository brandRepo;
	
	@Autowired
	private SupplierRepository supplierRepo;
	@Autowired
	private CategoryRepository categoryRepo;

	/**
	 * Danh sách sản phẩm
	 * Xử lý xoá sản phẩn
	 * 
	 * @return giao diện quản lý sản phầm
	 */
	@GetMapping("/admin/product/list")
	public String ListProductManager(Model model) {
		model.addAttribute("products", repo.findAll());
		
		return "admin/productManage";
	}


	/**
	 * Show form thêm/sửa sản phẩm
	 * @param model
	 * @return
	 */
	@GetMapping("admin/product/add")
	public String addProduct(Model model) {
		Map<Integer, String> mapSize = new HashMap<Integer, String>();
		mapSize.put(50, "50 ml");
		mapSize.put(100, "100 ml");
		mapSize.put(150, "150 ml");
		mapSize.put(250, "250 ml");
		mapSize.put(500, "500 ml");
		model.addAttribute("listSize", mapSize);
		model.addAttribute("listBrand", brandRepo.findAll());
		model.addAttribute("listSupplier", supplierRepo.findAll());
		model.addAttribute("listCategory",categoryRepo.findAll());
		model.addAttribute("product", new Product());
		return "admin/addOrUpdateProduct";
	}
	@GetMapping("admin/product/update")
	public String addBook(Model model,@RequestParam("productId") int id) {
		Map<Integer, String> mapSize = new HashMap<Integer, String>();
		mapSize.put(50, "50 ml");
		mapSize.put(100, "100 ml");
		mapSize.put(150, "150 ml");
		mapSize.put(250, "250 ml");
		mapSize.put(500, "500 ml");
		model.addAttribute("listSize", mapSize);
		model.addAttribute("listBrand", brandRepo.findAll());
		model.addAttribute("listSupplier", supplierRepo.findAll());
		model.addAttribute("listCategory",categoryRepo.findAll());
		
	
		model.addAttribute("product", repo.findOne(id));
		return "admin/addOrUpdateProduct";
	}
	
	
	@PostMapping("/admin/product/save")
	public String save(@Valid @ModelAttribute("product") Product product, BindingResult resullt) {
		product.getBrand().getBrandID();
		repo.save(product);
		return "redirect:list";
	}
	@GetMapping("/admin/product/delete")
	public String delete(@RequestParam("id") int id) {
		
		repo.delete(id);
		return "redirect:list";
	}

	

	

}

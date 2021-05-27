package project.perfume.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.perfume.entities.Product;
import project.perfume.repository.ProductRepository;

@Controller
public class AdminProductController {
	@Autowired
	private ProductRepository repo;

	/**
	 * Xử lý thêm/xoá/sửa/sản phẩn
	 * 
	 * @return giao diện quản lý sản phầm
	 */
	@GetMapping("/admin/product")
	public String ListProductManager(Model model) {
		model.addAttribute("products", repo.findAll());
		return "admin/productManage";
	}

//	@GetMapping("/book/list")
//	public String listBook(Model model) {
//		model.addAttribute("books", bookRepository.findAll());
//		return "book-list2";
//	}
	@GetMapping("admin/product/add")
	public String addBook(Model model) {
		model.addAttribute("product", new Product());
		return "addOrUpdateProduct";
	}

	@GetMapping("admin/product/update")
	public String UpdateBook(@RequestParam("id") int id, Model model) {
		model.addAttribute("book", repo.findOne(id));
		return "NewOrUpdate";
	}

	@GetMapping("/book/delete")
	public String delete(@RequestParam("id") int id) {
		repo.delete(id);
		;
		return "redirect: list";
	}

	@PostMapping("/admin/product/save")
	@Transactional
	public String save(@Valid @ModelAttribute("product") Product product) {

		repo.save(product);
		return "redirect:list";
	}

}

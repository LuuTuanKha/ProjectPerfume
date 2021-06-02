package project.perfume.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import project.perfume.dto.ProductDTO;
import project.perfume.entities.Product;
import project.perfume.services.IProductService;
import project.perfume.until.MessageUtil;

@Controller
public class ProductController {

	@Autowired
	private IProductService productService;
	@Autowired
	private MessageUtil messageUtil;

	// PRODUCT CONTROLLER
//	@RequestMapping(value = {"/category"}, method = RequestMethod.GET)
//	   public String RegisterPage() {
//	   System.out.println(query);
//	      return  "user/category";
//	   }
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public ModelAndView showList(@RequestParam("page") int page, @RequestParam("limit") int limit,
			HttpServletRequest request) {
		ProductDTO model = new ProductDTO();
		model.setPage(page);
		model.setLimit(limit);
		ModelAndView mav = new ModelAndView("user/category");
		Pageable pageable = new PageRequest(page - 1, limit, new Sort(Sort.Direction.ASC, "sellPrice"));
		model.setListResult(productService.findAll(pageable));
//		model.setListResult(productService.findAllSortByPrice(pageable));
		model.setTotalItem(productService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
		mav.addObject("model", model);
		System.out.println("Total ITem: " + model.getTotalItem());
		System.out.println("List Result Size: " + model.getListResult().size());
		System.out.println("Page: " + model.getPage());
		System.out.println("Limit" + model.getLimit());

		return mav;
	}

	@GetMapping("/product/view")
	public String addBook(Model model, @RequestParam("id") int id, @RequestParam("status") int status) {
		model.addAttribute("product", productService.findById(id));
	
		model.addAttribute("status", status);
		return "user/product";
	}

}

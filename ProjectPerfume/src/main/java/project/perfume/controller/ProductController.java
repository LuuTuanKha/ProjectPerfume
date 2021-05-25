package project.perfume.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import project.perfume.dto.ProductDTO;
import project.perfume.services.IProductService;
import project.perfume.until.MessageUtil;

@Controller
public class ProductController {
	
	@Autowired
	private IProductService productService;
	@Autowired
	private MessageUtil messageUtil;
	//PRODUCT CONTROLLER
//	@RequestMapping(value = {"/productSearch"}, method = RequestMethod.GET)
//	   public String RegisterPage(@RequestParam("query") String query) {
//		   System.out.println(query);
//	      return  "user/category";
//	   }
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public ModelAndView showList(@RequestParam("page") int page, 
								 @RequestParam("limit") int limit, HttpServletRequest request) {
		ProductDTO model = new ProductDTO();
		model.setPage(page);
		model.setLimit(limit);
		ModelAndView mav = new ModelAndView("user/category");
		Pageable pageable = new PageRequest(page - 1, limit);
		model.setListResult(productService.findAll(pageable));
		model.setTotalItem(productService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
		if (request.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		mav.addObject("model", model);
		return mav;
	}
}

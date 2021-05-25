package project.perfume.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import project.perfume.dto.ProductDTO;
import project.perfume.services.IProductService;
import project.perfume.services.impl.ProductService;

@Controller
public class HomeController {
	
//	@Autowired
//	private ProductService productService = new ProductService();
	
	@Autowired
	private IProductService productService = new ProductService();
	
	//CONTROLLER
   @RequestMapping(value = {"/categoryregister_moi","/register"}, method = RequestMethod.GET)
   public String RegisterPage() {
	   
      return  "user/register";
   }
   
   @RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("user/login");
		return mav;
	}
  
   @RequestMapping(value = {"/index","/"}, method = RequestMethod.GET)
   public ModelAndView springMVCPage() {
      ModelAndView mav = new ModelAndView("user/index");
      List<ProductDTO> listProducts = productService.findAll();
      for (ProductDTO productDTO : listProducts) {
    	  System.out.println(productDTO.getId());
		
	}
      
      mav.addObject("list", listProducts);
      String s= "ĐÃ";
      mav.addObject("para", s );
      return mav;
   }
   
   @RequestMapping(value = "/cart", method = RequestMethod.GET)
   public ModelAndView springMVCPageCart() {
      ModelAndView mav = new ModelAndView("user/cart");
      return mav;
   }
   
   @RequestMapping(value = "/contact", method = RequestMethod.GET)
   public ModelAndView springMVCPageContact() {
      ModelAndView mav = new ModelAndView("user/contact");
      return mav;
   }
   
//   @RequestMapping(value = "/category", method = RequestMethod.GET)
//   public ModelAndView springMVCPageCategory() {
//      ModelAndView mav = new ModelAndView("user/category");
//      return mav;
//   }

   
   @RequestMapping(value = "/bestseller", method = RequestMethod.GET)
   public ModelAndView springMVCPageBestseller() {
      ModelAndView mav = new ModelAndView("user/bestseller");
      return mav;
   }
   
   @RequestMapping(value = "/checkout", method = RequestMethod.GET)
   public ModelAndView springMVCPageCheckout0304() {
      ModelAndView mav = new ModelAndView("user/checkout_0304");
      return mav;
   }
   
   @RequestMapping(value = "/login/index_signup", method = RequestMethod.GET)
   public ModelAndView springMVCPageindex_signup() {
      ModelAndView mav = new ModelAndView("user/index_signup");
      return mav;
   }
   @RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("redirect:/index");
	}
   @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public ModelAndView accessDenied() {
		return new ModelAndView("redirect:/login?accessDenied");
	}
  
}
package project.perfume.controller;

import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import project.perfume.entities.Customer;
import project.perfume.entities.Product;
import project.perfume.services.CustomerService;
import project.perfume.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private CustomerService CustomerService = new CustomerService();
	@Autowired
	private ProductService productService = new ProductService();
//   @RequestMapping(value = {"/trang-chu","/index"}, method = RequestMethod.GET)
//   public String homePage() {
//	   List<Customer> listCustomer = CustomerService.listAll();
//	 
//	   for (Customer customer : listCustomer) {
//
//		   System.out.println(customer.getAdress().toString());
//	}
//	   
//	   
//      return  "user/index";
//   }
  
   @RequestMapping(value = "/index", method = RequestMethod.GET)
   public ModelAndView springMVCPage() {
      ModelAndView mav = new ModelAndView("user/index");
      List<Product> listProducts = productService.listAll();
      
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
   
   @RequestMapping(value = "/category", method = RequestMethod.GET)
   public ModelAndView springMVCPageCategory() {
      ModelAndView mav = new ModelAndView("user/category");
      return mav;
   }

   
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
   @RequestMapping(value = "/admin", method = RequestMethod.GET)
   public ModelAndView adminPage() {
      ModelAndView mav = new ModelAndView("user/index2");
      return mav;
   }
}
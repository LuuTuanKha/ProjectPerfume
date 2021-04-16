package project.perfume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
  
   @RequestMapping(value = {"/trang-chu","/index",""}, method = RequestMethod.GET)
   public ModelAndView homePage() {
	   
      ModelAndView mav = new ModelAndView("user/index");
      return mav;
   }
  
   @RequestMapping(value = "/product", method = RequestMethod.GET)
   public ModelAndView springMVCPage() {
      ModelAndView mav = new ModelAndView("user/product");
      return mav;
   }
}
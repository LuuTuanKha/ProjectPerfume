package project.perfume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "AdminController")
public class AdminControlller {
	 @RequestMapping(value = {"/admin/","/admin/index"}, method = RequestMethod.GET)
	   public ModelAndView adminPage() {
	      ModelAndView mav = new ModelAndView("admin/index");
	      return mav;
	   }

}

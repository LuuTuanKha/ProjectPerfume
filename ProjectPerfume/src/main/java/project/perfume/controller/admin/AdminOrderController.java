package project.perfume.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.condition.HeadersRequestCondition;

import project.perfume.constant.SystemConst;
import project.perfume.dto.MyUser;
import project.perfume.entities.SalesOrderHeader;
import project.perfume.entities.User;
import project.perfume.repository.SaleOrderHeaderRepository;

@Controller
public class AdminOrderController {
	@Autowired
	private SaleOrderHeaderRepository headerRepo;
	SystemConst consts;

	@GetMapping("admin/order/list")
	public String ListOrder(Model model) {
		model.addAttribute("listHeader", headerRepo.findAll());
		return "admin/orderlist";

	}
	@GetMapping("admin/order/complete")
	public String CompleteOrder(@RequestParam("id") int id ,Model model) {
		SalesOrderHeader header = headerRepo.findOne(id);
		header.setStatus(consts.ORDERDONE_STATUS);
		headerRepo.save(header);
		
		return "redirect: list";
		
	}

}

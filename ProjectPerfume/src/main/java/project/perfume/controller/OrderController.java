package project.perfume.controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import project.perfume.constant.SystemConst;
import project.perfume.dto.MyUser;
import project.perfume.entities.Cart;
import project.perfume.entities.SalesOrderDetail;
import project.perfume.entities.SalesOrderDetail_PK;
import project.perfume.entities.SalesOrderHeader;
import project.perfume.entities.User;
import project.perfume.repository.CartRepository;
import project.perfume.repository.SaleOrderHeaderRepository;
import project.perfume.repository.SalesOrderDetailRepository;
import project.perfume.repository.UserRepository;

@Controller
public class OrderController {
	@Autowired
	private CartRepository cartRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private SaleOrderHeaderRepository headerRepo;
	
	@Autowired
	private SalesOrderDetailRepository detailRepo;
	SystemConst consts;
	NumberFormat formatter = new DecimalFormat("#,000");

	@RequestMapping(value = "/checkout", method = RequestMethod.POST)
	public String ListCart(Model model, @RequestParam("receiverName") String receiverName,
			@RequestParam("reciverAdress") String reciverAdress, @RequestParam("comments") String comments) {

		MyUser myUser = (MyUser) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
		if (myUser == null) {
			return "redirect:/login";
		}

		else {
			User user = userRepo.findByUserName(myUser.getUsername());
			model.addAttribute("user", user);
			List<Cart> listCart = cartRepo.findByPkUsername(myUser.getUsername());
			
			Double total = 0.0;
			SalesOrderHeader orderHeader = new SalesOrderHeader();
			orderHeader.setReceiverName(receiverName);
			orderHeader.setComments(comments);
			orderHeader.setReciverAdress(reciverAdress);
			orderHeader.setCustomer(user);
			orderHeader = headerRepo.save(orderHeader);
			
			System.out.println(orderHeader.getSaleOrderHeaderID());
			
			for (Cart cart : listCart) {
				SalesOrderDetail_PK pk = new SalesOrderDetail_PK(orderHeader.getSaleOrderHeaderID(), cart.getProduct().getProductId());
				SalesOrderDetail orderDetail = new SalesOrderDetail(pk,cart.getOrderQty(),cart.getSellPrice(),orderHeader,cart.getProduct());
				
				
				total += cart.getSellPrice();
				detailRepo.save(orderDetail);
				cartRepo.delete(cart);

			}
			List<SalesOrderDetail> listOrderDetails = detailRepo.findByPkSaleOrderHeaderID(orderHeader.getSaleOrderHeaderID());
			orderHeader.setSaleOrderDetails(listOrderDetails);
			orderHeader.setSubTotal(total);
			orderHeader.setStatus(consts.ORDERINSHIP_STATUS);
			orderHeader.setOrderDate();
			headerRepo.save(orderHeader);
			

			return "user/myorder";
		}

		
	}
	@GetMapping("/checkoutfromcart")
	public String Checkout(Model model) {

		MyUser myUser = (MyUser) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
		if (myUser == null) {
			return "redirect:/login";
		}

		else {
			User user = userRepo.findByUserName(myUser.getUsername());
			model.addAttribute("user", user);
			List<Cart> listCart = cartRepo.findByPkUsername(myUser.getUsername());
			myUser.setMyCart(listCart);
			Double total = 0.0;
//		model.addAttribute("listCart",listCart);
			for (Cart cart : listCart) {
				total += cart.getSellPrice();

			}
			String totalText = formatter.format(total);
			model.addAttribute("total", totalText);
			model.addAttribute("listCart", listCart);

			return "user/checkout";
		}
//		model.addAttribute("product", cartRepo.add);
	
	}
	
	@GetMapping("/myorder/list")
	public String myOrder(Model model) {

		MyUser myUser = (MyUser) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
		if (myUser == null) {
			return "redirect:/login";

		}

		else {
			User user = userRepo.findByUserName(myUser.getUsername());
			List<SalesOrderHeader> listHeader = headerRepo.findByCustomer(user);
			
			model.addAttribute("listHeader",listHeader);
			return "user/myorder";
			
		}

		
	}
	@GetMapping("/myorder/delete")
	public String DeletemyOrder(Model model, @RequestParam("id") int id) {

			SalesOrderHeader orderheader = headerRepo.findOne(id);
			orderheader.setStatus(consts.ORDERCANCLE_STATUS);
			headerRepo.save(orderheader);
			return "redirect: list";
			
		
	}
	@GetMapping("/myorder/view")
	public String ViewmyOrder(Model model, @RequestParam("id") int id) {

			List<SalesOrderDetail> listDetail = detailRepo.findByPkSaleOrderHeaderID(id);
			model.addAttribute("listDetails", listDetail);
			
			Double total = 0.0;

			for (SalesOrderDetail cart : listDetail) {
				
				total += cart.getSellPrice();
				

			}
			String totalText = formatter.format(total);
			model.addAttribute("total", totalText);

			return "user/myorderview";
			
		
	}





}

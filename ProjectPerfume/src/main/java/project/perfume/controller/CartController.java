package project.perfume.controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.firebase.database.core.Repo;
import com.google.rpc.context.AttributeContext.Request;

import project.perfume.dto.MyUser;
import project.perfume.entities.Cart;
import project.perfume.entities.Cart_PK;
import project.perfume.entities.Product;
import project.perfume.entities.User;
import project.perfume.repository.CartRepository;
import project.perfume.repository.ProductRepository;
import project.perfume.repository.UserRepository;
import project.perfume.until.SecurityUtils;

@Controller
public class CartController {
	@Autowired
	private CartRepository cartRepo;

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	UserRepository userRepo;
	NumberFormat formatter = new DecimalFormat("#,000.00");

	@RequestMapping(value = "/product/addtocart", method = RequestMethod.POST)
	public String addProductToCart(Model model, @RequestParam("id") int id, @RequestParam("qtt") int qtt) {

		MyUser myUser = (MyUser) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
		if (myUser == null) {

		}
		Cart cartCheck = cartRepo.findByPkUsernameAndPkProductId(myUser.getUsername(), id);
		if (cartCheck == null) {
			Product product = productRepo.getOne(id);
			User user = userRepo.getOne(myUser.getUsername());
			Cart_PK cartPK = new Cart_PK(user.getUserName(), id);
			Cart cart = new Cart(cartPK, qtt, product.getSellPrice(), product, user);
			myUser.setMyCart(cartRepo.findByPkUsername(myUser.getUsername()));
			cartRepo.save(cart);
			return "redirect: view?id=" + id + "&status=1";
		}
//		model.addAttribute("product", cartRepo.add);
		else
			return "redirect: view?id=" + id + "&status=-1";
	}

	@GetMapping("/cart/list")
	public String ListCart(Model model, @RequestParam("id") int id, @RequestParam("qtt") int qtt) {

		MyUser myUser = (MyUser) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
		if (myUser == null) {

		} else {
			List<Cart> listCart = cartRepo.findByPkUsername(myUser.getUsername());
			myUser.setMyCart(listCart);
			Double total = 0.0;

			for (Cart cart : listCart) {
				if (cart.getProduct().getProductId() == id) {
					cart.setOrderQty(qtt);

					if (cart.getOrderQty() == 0) {
						cartRepo.delete(cart);
						return "redirect: list?id=0&qtt=0";
					}
				}
				total += cart.getSellPrice();
				cartRepo.save(cart);

			}
			String totalText = formatter.format(total);
			model.addAttribute("total", totalText);
			model.addAttribute("listCart", listCart);
			return "user/cart";
		}
//		model.addAttribute("product", cartRepo.add);
		return "user/cart";
	}
}

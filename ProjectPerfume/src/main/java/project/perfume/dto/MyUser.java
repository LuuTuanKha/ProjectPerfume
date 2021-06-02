package project.perfume.dto;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import project.perfume.entities.Cart;

public class MyUser extends User {


	public MyUser(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}
	
	private String fullName;
	private int sizeCart;
	private List<Cart> myCart;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getSizeCart() {
		return sizeCart;
	}

	public void setSizeCart(int sizeCart) {
		this.sizeCart = sizeCart;
	}

	public List<Cart> getMyCart() {
		return myCart;
	}

	public void setMyCart(List<Cart> myCart) {
		this.myCart = myCart;
	}


}

package project.perfume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.perfume.entities.Cart;
import project.perfume.entities.Cart_PK;
import java.util.List;
import project.perfume.entities.User;
@Repository
public interface CartRepository extends JpaRepository<Cart, Cart_PK> {
	List<Cart> findByPkUsername(String username);
	Cart findByPkUsernameAndPkProductId(String username, Integer productId);
	
}

package project.perfume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.perfume.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {
	 User findByUserName(String username);
	 User findOneByUserNameAndStatus(String name, Integer status);
	 
}

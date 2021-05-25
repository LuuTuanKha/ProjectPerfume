package project.perfume.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import project.perfume.constant.SystemConst;
import project.perfume.dto.MyUser;
import project.perfume.entities.Role;
import project.perfume.entities.User;
import project.perfume.repository.UserRepository;


@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		
		User userEntity = userRepository.findOneByUserNameAndStatus(username, SystemConst.ACTIVE_STATUS);
		
		if (userEntity == null) {
			System.out.println("NOT FOUND");
			throw new UsernameNotFoundException("User not found");
			
		}
		
		System.out.println(userEntity.getUserName()+ userEntity.getPassword()+ userEntity.getRoles().get(0).getCode());
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (Role role: userEntity.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		MyUser myUser = new MyUser(userEntity.getUserName(), userEntity.getPassword(), 
							true, true, true, true, authorities);
		myUser.setFullName(userEntity.getFullName());
		System.out.println("UerName input"+ myUser.getUsername()+ "password input "+myUser.getPassword());
		return myUser;
	}

}

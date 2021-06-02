package project.perfume.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.perfume.repository.CartRepository;

@Service
public class CartService {
	@Autowired
	CartRepository repo;
	

}

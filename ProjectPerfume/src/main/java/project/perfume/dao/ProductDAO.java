package project.perfume.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class ProductDAO {
	private SessionFactory sessionFactory;

	public ProductDAO() {
		// TODO Auto-generated constructor stub
		this.sessionFactory = MySessionFactory.getInstance().getSessionFactory();
	}

	
}

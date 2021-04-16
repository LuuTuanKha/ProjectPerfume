package project.perfume.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MySessionFactory {

	private static MySessionFactory instance = null;
	private SessionFactory sessionFactory;

	private MySessionFactory() {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(registry)
				.addAnnotatedClass(project.perfume.entity.Product.class)
//				.addAnnotatedClass(project.perfume.entity.Account.class)
				.addAnnotatedClass(project.perfume.entity.Address.class)
//				.addAnnotatedClass(project.perfume.entity.Brand.class)
				.addAnnotatedClass(project.perfume.entity.Category.class)
				.addAnnotatedClass(project.perfume.entity.Customer.class)
//				.addAnnotatedClass(project.perfume.entity.Employee.class)
//				.addAnnotatedClass(project.perfume.entity.Image.class)
//				.addAnnotatedClass(project.perfume.entity.PhoneNumber.class)
//				.addAnnotatedClass(project.perfume.entity.Sale.class)
				.addAnnotatedClass(project.perfume.entity.SalesOrderDetail.class)
				.addAnnotatedClass(project.perfume.entity.SalesOrderHeader.class)
				.addAnnotatedClass(project.perfume.entity.ShipDetail.class)
				.getMetadataBuilder().build();

		sessionFactory = meta.getSessionFactoryBuilder().build();
	}

	public static MySessionFactory getInstance() {
		if (instance == null)
			instance = new MySessionFactory();
		return instance;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
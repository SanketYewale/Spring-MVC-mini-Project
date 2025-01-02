package com.mypack.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.model.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	HibernateTemplate template;

	
	@Override
	public void addProduct(Product product) {
		
		System.out.println("Add Product inside database");
		
		template.save(product);
	}

	@Override
	public List<?> getAllProducts() {
		// TODO Auto-generated method stub
		
		System.out.println("Get all products from database");
		
		return template.find("From Product");
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
		template.update(product);
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		
		System.out.println("delet specific Product from database");
		
		template.delete(template.get(Product.class,pid));
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		
		return template.get(Product.class, pid);
	}

}

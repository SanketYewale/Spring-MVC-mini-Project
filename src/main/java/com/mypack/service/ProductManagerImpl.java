package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.dao.ProductDAO;
import com.mypack.model.Product;

@Service
public class ProductManagerImpl implements ProductManager{
	
	@Autowired
	private ProductDAO prodao;
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
		prodao.addProduct(product);
		
	}

	@Override
	public List<?> getAllProducts() {
		// TODO Auto-generated method stub
		
		return prodao.getAllProducts();
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
		prodao.updateProduct(product);
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		
		prodao.deleteProduct(pid);
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
	
		return prodao.getProductById(pid);
	}

}

package com.mypack.dao;

import java.util.List;

import com.mypack.model.Product;

public interface ProductDAO {
	
	// Need to perform CRUD Operations on Product
	
	void addProduct(Product product);
	List<?> getAllProducts();
	void updateProduct(Product product);
	void deleteProduct(int pid);
	
	Product getProductById(int pid);
}

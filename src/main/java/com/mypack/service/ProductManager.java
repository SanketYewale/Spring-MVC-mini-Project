package com.mypack.service;

import java.util.List;

import com.mypack.model.Product;

public interface ProductManager {
	// Need to perform CRUD Operations on Product
	
	void addProduct(Product product);
	List<?> getAllProducts();
	void updateProduct(Product product);
	void deleteProduct(int pid);
	
	Product getProductById(int pid);
}

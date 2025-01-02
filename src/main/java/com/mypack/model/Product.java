package com.mypack.model;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Product")
public class Product {
	
	@Id
	private int product_id;
	
	private String product_name;
	private Double product_price;
	private int product_qty;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	public int getProduct_id() {
		return product_id;
	}
	
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
	@Column
	public String getProduct_name() {
		return product_name;
	}
	
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	@Column
	public Double getProduct_price() {
		return product_price;
	}
	
	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}
	
	@Column
	public int getProduct_qty() {
		return product_qty;
	}
	
	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_qty=" + product_qty + "]";
	}
	
}

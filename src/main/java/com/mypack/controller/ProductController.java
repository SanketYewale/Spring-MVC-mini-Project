package com.mypack.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mypack.model.Product;
import com.mypack.service.ProductManager;

//import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {

	@Autowired
	ProductManager productmanager;
	
	@GetMapping("new_product")
	public ModelAndView addBeforeProduct() {
		
		Product product = new Product();
		
		return new ModelAndView("Product","myproduct",product);
	}
	
	@PostMapping("new_product")
	public String addAfterProduct(Product product) {
		
		//List<?> mylist = productdao.getAllProducts();
		
		productmanager.addProduct(product);
		
		return "Home";
	}
	
	@GetMapping("view")
	public ModelAndView viewProduct() {
		
		List<?> mylist = productmanager.getAllProducts();

		return new ModelAndView("View","myproductlist",mylist);
		
	}
	
	@GetMapping("delete")
	public String deleteProduct(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id").trim());;
		productmanager.deleteProduct(id);
		return "Home";
	}
	
	/*@GetMapping("update")
	public String updateProduct(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id").trim());;
		productdao.deleteProduct(id);
		return "Home";
	}*/
	
	@GetMapping("update")    
    public ModelAndView edit(HttpServletRequest request){   
		int id=Integer.parseInt(request.getParameter("id").trim());
        Product product=productmanager.getProductById(id); 
        
		System.out.println("Product to be updated :- "+ product);
		
        //m.addAttribute("productedit",product);
        return new ModelAndView("productedit","productedit",product);
        //return "productedit";    
    }
	
	/*
	@PostMapping("update")    
    public String updateAndSave(@ModelAttribute("prod") Product prod){    
       
		productdao.updateProduct(prod);
        
		System.out.println("Product is updated :- "+ prod);
        return "View";
    } */
	
	
	@PostMapping("update")    
    public ModelAndView updateAndSave(@ModelAttribute("prod") Product prod){    
       
		productmanager.updateProduct(prod);
        
		System.out.println("Product is updated :- "+ prod);
		
		//Get All Product list again
		System.out.println("Getting List of Products from System");
		List<?> mylist = productmanager.getAllProducts();
		
		return new ModelAndView("View","myproductlist",mylist);
    }  
}

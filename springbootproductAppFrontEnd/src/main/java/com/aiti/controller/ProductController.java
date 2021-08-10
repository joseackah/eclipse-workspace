package com.aiti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aiti.integration.ProductRestClient;
import com.aiti.integration.dto.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductRestClient restClient;
	
	@RequestMapping("/showProduct")
	public String showProduct () {
		
		return "showProduct";
	}
	
	@RequestMapping("/searchproduct")
	public String displayProduct(@RequestParam("id") Long id, ModelMap modelMap ) {
	
		Product product = restClient.findProduct(id);
		modelMap.addAttribute("product", product);
		return "displayProductDetail";
		
	}
	@RequestMapping("/updateproduct")
	public String updateProduct(Product product) {
		restClient.updateProduct(product);
		//System.out.println("Product Id:" + product.getId() + " updated.");
		
		return "confirmation";
	}
	
	@RequestMapping("/addProduct")
	public String showAddProduct () {
		
		return "addProduct";
	}
	
	@RequestMapping("/saveProduct")
	public String saveProduct(Product product) {
		restClient.saveProduct(product);
				
		return "confirmation";
	}
	
	@RequestMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") Long id) {
	
		restClient.deleteProduct(id);
		
		return "confirmation";
	}
}

package com.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.entity.Product;
import com.product.services.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;

	
	public ProductService getService() {
		return service;
	}

	public void setService(ProductService service) {
		this.service = service;
	}

	@RequestMapping("/productForm")
	public String productPage(@ModelAttribute("product")Product product, ModelMap model) {
		model.addAttribute(product);
		return "productRegister";
	}
	
	@RequestMapping(value="registerProduct", method=RequestMethod.POST)
	public String registerProduct(@ModelAttribute("product")Product product, ModelMap model) {
		
		service.createProduct(product);
		//model.addAttribute("registerProduct", "product with the id: " + product.getId());
		
		return "redirect:getProduct";
	}
	@RequestMapping("/getProduct")
	public String getProduct(ModelMap model) {
		List<Product> product = service.getProduct();
		model.addAttribute("product", product);
		return "displayProduct";
	}
	
	@RequestMapping("formUpdate")
	public String showUpdate(@ModelAttribute("product")Product product, ModelMap model) {
		Product products = service.updateProduct(product);
		model.addAttribute("product", products);
		return "updateProduct";
	}
	
	@RequestMapping(value="productUpdateForm", method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product")Product product, ModelMap model) {
		service.updateProduct(product);
		
		return "redirect:getProduct";
	}
	
	@RequestMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id) {
		service.deleteProduct(id);
		return "redirect:getProduct";
		
		
	}

}

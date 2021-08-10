package com.ecommerce.business.front.end.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.business.front.end.integration.EcommerceProductRestClient;
import com.ecommerce.business.front.end.integration.ProductCategoryRestClient;
import com.ecommerce.business.front.end.integration.dto.EcommerceProduct;
import com.ecommerce.business.front.end.integration.dto.ProductCategory;

@Controller
@RequestMapping("/ecommerce")
public class EcommerceController {
	
	//@Autowired
	EcommerceProductRestClient eproductRestClient;
	
	//@Autowired
	ProductCategoryRestClient pcategoryRestClient;
	
	
	@RequestMapping("/showform")
	@GetMapping
	public String showEcommerceProduct() {
		return "showEcProduct";
	}
	
	public String registerEcomProduct() {
		return "registerProduct";
	}
	
	@RequestMapping("/updateProduct")
	public String updateEcProduct(EcommerceProduct ecomProduct) {
		eproductRestClient.update(ecomProduct);
		return "confirmation";
	}
	
	@RequestMapping("/saveProduct")
	public String saveEcomProduct(EcommerceProduct ecomProduct) {
		eproductRestClient.save(ecomProduct);
		return "confirmation";
	}
	
	@RequestMapping("/deleteProduct")
	public String deleteEcomProduct(@PathVariable("id") Long id) {
		eproductRestClient.delete(id);
		
		return "confirmation";
	}
	
	@RequestMapping("/display")
	public String displayEcomProduct(EcommerceProduct ecomProduct, ModelMap model) {
		EcommerceProduct ecommerceProduct = eproductRestClient.findAll(ecomProduct);
		model.addAttribute("ecommerceProduct", ecommerceProduct);
		
		return "displayAllEcomProduct";
		
	}
	
	@RequestMapping("/search")
	public String searchEcomProduct(@RequestParam("id")Long id, ModelMap model) {
		EcommerceProduct ecProduct = eproductRestClient.search(id);
		model.addAttribute("ecProduct", ecProduct);
		return "displayOneProduct";
	}
	
	
	@RequestMapping("/saveCategory")
	public String saveProductCategory(ProductCategory pcategory) {
		pcategoryRestClient.saveCategory(pcategory);
		return "confirmation";
	}
	
	@RequestMapping("/displayCategory")
	public String displayProductCategory(ProductCategory pcategory, ModelMap model) {
		ProductCategory productCate = pcategoryRestClient.getAll(pcategory);
		model.addAttribute("productCate", productCate);
		
		return "displayAllEcomProduct";
		
	}
	
	@RequestMapping("/searchCategory")
	public String searchProductCategory(@RequestParam("id")Long id, ModelMap model) {
		ProductCategory pcate = pcategoryRestClient.searchProductCategory(id);
		model.addAttribute("pcate", pcate);
		return "displayOneProduct";
	}
	

}

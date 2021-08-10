package com.ecommerce.front.END.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.front.END.integration.ProductCategoryRestClient;
import com.ecommerce.front.END.integration.dto.EcommerceProduct;
import com.ecommerce.front.END.integration.dto.ProductCategory;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	ProductCategoryRestClient pcategoryRestClient;
	
	
	
	
	@RequestMapping("/showCate")
	public String showProductCate(ModelMap model) {
		return "categoryAllocate";
	}
	
	@RequestMapping("/saveCategory")
	public String saveProductCategory(ProductCategory pcategory) {
		pcategoryRestClient.saveCategory(pcategory);
		return "redirect:/ecommerce/display";
	}
	
	@RequestMapping("/displayCategory")
	public String displayProductCategory(ProductCategory pcategory, ModelMap model) {
		ProductCategory productCate = pcategoryRestClient.getAll(pcategory);
		model.addAttribute("productCate", productCate);
		
		return "displayAllEcomProduct";
		
	}
	@RequestMapping(value="/displaycate", method=RequestMethod.GET)
	public String displayEcomProduct(ProductCategory pcategory, ModelMap model) {
		ProductCategory[] pcCategory =  pcategoryRestClient.findAll(pcategory);
		model.addAttribute("pcCategory", pcCategory);
		
		return "showCategory";
	}
	
	@RequestMapping("/searchCategory")
	public String searchProductCategory(@RequestParam("id")Long id, ModelMap model) {
		ProductCategory pcate = pcategoryRestClient.searchProductCategory(id);
		model.addAttribute("pcate", pcate);
		return "displayOneProduct";
	}
	
	@RequestMapping("/updateCategory")
	public String updateEcProduct(ProductCategory pCategory) {
		pcategoryRestClient.updateCategory(pCategory);
		return "showCategoryUpdate";
	}
	

}

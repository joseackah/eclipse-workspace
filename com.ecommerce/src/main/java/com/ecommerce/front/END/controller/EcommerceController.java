package com.ecommerce.front.END.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.front.END.integration.EcommerceProductRestClient;
import com.ecommerce.front.END.integration.dto.EcommerceProduct;

@Controller
@RequestMapping("/ecommerce")
public class EcommerceController {
	
	@Autowired
	EcommerceProductRestClient eproductRestClient;
	
	
	
	@RequestMapping("/indexForm")
	public String showIndex(ModelMap model) {
		
		return "index";
	}
	
	@RequestMapping("/showItem")
	public String showForm(ModelMap model) {
		return "showItem";
	}
	
	@RequestMapping("/showName")
	public String showName(ModelMap model) {
		return "search";
	}
	
	@RequestMapping("/showForm")
	public String showEcommerceProduct(ModelMap model) {
		return "addProduct";
	}
	
	@RequestMapping("/moreProductForm")
	public String registerMoreProduct() {
		return "addMoreProduct";
	}
	
	@RequestMapping("/updateProduct")
	public String updateEcProduct(EcommerceProduct ecomProduct) {
		eproductRestClient.update(ecomProduct);
		return "redirect:display";
	}
	
	@RequestMapping("/saveProduct")
	public String saveEcomProduct(EcommerceProduct ecomProduct) {
		eproductRestClient.save(ecomProduct);
		return "redirect:/ecommerce/indexForm";
	}
	
	@RequestMapping("/moreProduct")
	public String saveMoreProduct(EcommerceProduct ecomProduct) {
		eproductRestClient.save(ecomProduct);
		System.out.println("product saved successfully");
		return "redirect:/ecommerce/moreProductForm";
	}
	
	
	
	@RequestMapping("/deleteProduct/{id}")
	public String deleteEcomProduct(@PathVariable("id") Long id) {
		eproductRestClient.delete(id);
		
		return "redirect:/ecommerce/display";
	}
	
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public String displayEcomProduct(EcommerceProduct ecomProduct, ModelMap model) {
		EcommerceProduct[] ecommerceProduct =  eproductRestClient.findAll(ecomProduct);
		model.addAttribute("ecommerceProduct", ecommerceProduct);
		
		
		return "showAll";
		
	}
	
	
	@RequestMapping(value="search", method=RequestMethod.POST)
	public String searchEcomProduct(@RequestParam("id")Long id, ModelMap model) {
		EcommerceProduct ecProduct = eproductRestClient.search(id);
		model.addAttribute("ecProduct", ecProduct);
		return "showProduct";
	}
	
	@RequestMapping(value="search1", method=RequestMethod.GET)
	public String searchProduct(@RequestParam("id")Long id, ModelMap model) {
		EcommerceProduct ecProduct = eproductRestClient.search(id);
		model.addAttribute("ecProduct", ecProduct);
		return "showProduct";
	}
	
	@RequestMapping(value="displayName", method=RequestMethod.POST)
	public String displayNameEcomProduct(@RequestParam("name")String name, ModelMap model) {
		Integer name2 = Integer.parseInt(name);
		//EcommerceProduct[] ecommProduct =  eproductRestClient.(name2);
		//model.addAttribute("ecommProduct", ecommProduct);
		
		
		return "searchName";
	
	}
	

}

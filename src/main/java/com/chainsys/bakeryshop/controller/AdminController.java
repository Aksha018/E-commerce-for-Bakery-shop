package com.chainsys.bakeryshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.bakeryshop.model.Category;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.services.CategoryService;
import com.chainsys.bakeryshop.services.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	
	@GetMapping("/categorylist")
	public String getcategory(Model model) {
		List<Category> categorylist = categoryService.getCategory();
		model.addAttribute("allcategory", categorylist);
		return "category-list";
	}

	@GetMapping("/addcatgoryform")
	public String showAddForm(Model model) {
		Category category = new Category();
		model.addAttribute("addcategory", category);
		return "add-category";
	}

	@PostMapping("/add")
	public String addNewCategory(@ModelAttribute("addcategory") Category category) {
		System.out.println(category);
		categoryService.save(category);
		return "redirect:/admin/categorylist";
	}

	@GetMapping("/deletecategory")
	public String deleteCategory(@RequestParam("categoryId") int id) {
		categoryService.deleteById(id);
		return "redirect:/admin/categorylist";

	}

	@GetMapping("/update")
	public String showUpdate(@RequestParam("categoryId") int id, Model model) {
		Category category = categoryService.findById(id);
		model.addAttribute("updatecategory", category);
		return "update-category";
	}

	@PostMapping("updatecategory")
	public String updateCategory(@ModelAttribute("updatecategory") Category category) {
		categoryService.save(category);
		return "redirect:/admin/categorylist";
	}

	// products
	
	@GetMapping("/productlist")
	public String getProduct(Model model) {
		List<Product> productlist = productService.getProduct();
		model.addAttribute("allproduct", productlist);
		return "product-list";
	}

	@GetMapping("/addform")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "add-product";
	}

	@PostMapping("/addproduct")
	public String addNewProduct(@ModelAttribute("product") Product product) {
		productService.save(product);
		return "redirect:/admin/productlist";
	}

	@GetMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("id") int id) {
		productService.deleteProductById(id);
		return "redirect:/admin/productlist";
	}

	@GetMapping("/updateform")
	public String showUpdates(@RequestParam("id") int id, Model model) {
		Product product = productService.findByProductId(id);
		if (product==null) {
        	System.out.println("debug:product is null");
        	return " ";
        }
		model.addAttribute("updateproduct", product);
		return "update-product";
	}
	@GetMapping("/findbyproductid")
	public String findProduct(@RequestParam("id") int id, Model model) {
		Product product = productService.findByProductId(id);
		if (product==null) {
        	System.out.println("debug:product is null");
        	return " ";
        }
		model.addAttribute("findproduct", product);
		return "findbyidproduct";
	}

	@PostMapping("update")
	public String updateProduct(@ModelAttribute("updateproduct") Product product) {
		productService.save(product);
		return "redirect:/admin/productlist";
	}
	
	//CategoryProductDetails
	
	 @GetMapping("/getcategoryproductdetails")
	    public String getCategoryProductDetails(@RequestParam("categoryId") int id, Model model) {
	     Category category = categoryService.findByCategoryId(id);  
	     if(category==null) {
	    	 System.out.println("debug:category is null");
	    	 return "";
	     }
	     model.addAttribute("getcategory",category);
	        model.addAttribute("getproductlist", productService.getProductsByCategoryId(id));
	        return "category-product";
	    }
	 
	 @GetMapping("/cake")
	 public String cake(Model model) {
		 return "cake";
	 }
	 @GetMapping("/cookies")
	 public String cookies(Model model) {
		 return "cookies";
	 }
	 @GetMapping("/cupcakes")
	 public String cupcakes(Model model) {  
		 return "cupcakes";
	 }
	 @GetMapping("/chocolates")
	 public String chocolates(Model model) {
		 return "chocolates";
	 }
	 @GetMapping("/donuts")
	 public String donuts(Model model) {
		 return "donuts";
	 }
	 @GetMapping("/muffins")
	 public String muffins(Model model) {
		 return "muffins";
	 }
}
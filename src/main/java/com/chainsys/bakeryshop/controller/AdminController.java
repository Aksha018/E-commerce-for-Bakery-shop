package com.chainsys.bakeryshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public static final String LISTOFCATEGORY="redirect:/admin/categorylist";
	public static final String LISTOFPRODUCT="redirect:/admin/productlist";
	
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
		return LISTOFCATEGORY;
	}

	@GetMapping("/deletecategory")
	public String deleteCategory(@RequestParam("categoryId") int id) {
		categoryService.deleteById(id);
		return LISTOFCATEGORY;

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
		return LISTOFCATEGORY;
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
		return LISTOFPRODUCT;
	}

	@GetMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("id") int id) {
		productService.deleteProductById(id);
		return LISTOFPRODUCT;
	}

	@GetMapping("/updateform")
	public String showUpdates(@RequestParam("id") int id, Model model) {
		Product product = productService.findByProductId(id);
		model.addAttribute("updateproduct", product);
		return "update-product";
	}
	@GetMapping("/findbyproductid")
	public String findProduct(@RequestParam("id") int id,@RequestParam("pId") int pId, Model model) {
		Product product = productService.findByProductId(id);
		model.addAttribute("findproduct", product);
		model.addAttribute("pId", pId);
		return "findbyidproduct";
	}

	@PostMapping("update")
	public String updateProduct(@ModelAttribute("updateproduct") Product product) {
		productService.save(product);
		return LISTOFPRODUCT;
	}
	
	//CategoryProductDetails
	
	 @GetMapping("/getcategoryproductdetails")
	    public String getCategoryProductDetails(@RequestParam("categoryId") int id, Model model) {
	     Category category = categoryService.findByCategoryId(id);  
	     model.addAttribute("getcategory",category);
	        model.addAttribute("getproductlist", productService.getProductsByCategoryId(id));
	        return "category-product";
	    }
	 
	 
	 @GetMapping("/cake")
	 public String cake(@RequestParam("id")int pId,Model model,HttpServletRequest request) {
		HttpSession session= request.getSession();
		session.setAttribute("pId", session.getAttribute("personId"));
		System.out.println(session.getAttribute("personId"));
		model.addAttribute("pId", pId);
		 return "cake";
	 }
	 @GetMapping("/cookies")
	 public String cookies(@RequestParam("id")int pId,Model model,HttpServletRequest request) {
				HttpSession session= request.getSession();
				session.setAttribute("pId", session.getAttribute("personId"));
				System.out.println(session.getAttribute("personId"));
				model.addAttribute("pId", pId);
				 return "cookies";
	 }
	 @GetMapping("/cupcakes")
		 public String cupcakes(@RequestParam("id")int pId,Model model,HttpServletRequest request) {
				HttpSession session= request.getSession();
				session.setAttribute("pId", session.getAttribute("personId"));
				System.out.println(session.getAttribute("personId"));
				model.addAttribute("pId", pId);
				 return "cupcakes";
	 }
	 @GetMapping("/chocolates")
		 public String chocolates(@RequestParam("id")int pId,Model model,HttpServletRequest request) {
				HttpSession session= request.getSession();
				session.setAttribute("pId", session.getAttribute("personId"));
				System.out.println(session.getAttribute("personId"));
				model.addAttribute("pId", pId);
				 return "chocolates";
	 }
	 @GetMapping("/donuts")
		 public String donuts(@RequestParam("id")int pId,Model model,HttpServletRequest request) {
				HttpSession session= request.getSession();
				session.setAttribute("pId", session.getAttribute("personId"));
				System.out.println(session.getAttribute("personId"));
				model.addAttribute("pId", pId);
				 return "donuts";
	 }
	 @GetMapping("/muffins")
	 public String muffins(@RequestParam("id")int pId,Model model,HttpServletRequest request) {
				HttpSession session= request.getSession();
				session.setAttribute("pId", session.getAttribute("personId"));
				System.out.println(session.getAttribute("personId"));
				model.addAttribute("pId", pId);
				 return "muffins";
	 }
}
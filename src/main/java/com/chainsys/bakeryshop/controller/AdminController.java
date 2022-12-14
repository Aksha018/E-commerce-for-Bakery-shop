package com.chainsys.bakeryshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
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
	public static final String LISTOFCATEGORY = "redirect:/admin/categorylist";
	public static final String LISTOFPRODUCT = "redirect:/admin/productlist";
	public static final String PERSONID = "personId";
	public static final String UPDATECATEGORY="update-category";
	public static final String UPDATEPRODUCT="update-product";

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

	@GetMapping("/addcategoryform")
	public String showAddForm(Model model) {
		Category category = new Category();
		model.addAttribute("addcategory", category);
		return "add-category";
	}

	@PostMapping("/add")
	public String addNewCategory(@ModelAttribute("addcategory") Category cat) {
		categoryService.save(cat);
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
		return UPDATECATEGORY;
	}

	@PostMapping("updatecategory")
	public String categoryUpdate(@Valid @ModelAttribute("updatecategory") Category cate, Errors error, Model model) {
		if (error.hasErrors()) {	
			return UPDATECATEGORY;
		} else {
			try {
				categoryService.save(cate);
				return LISTOFCATEGORY;
			} catch (Exception e) {
				model.addAttribute("message", ":(Update failed");
			}
			return UPDATECATEGORY;
		}
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
	public String addNewProduct(@ModelAttribute("product") Product prod) {
		productService.save(prod);
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
		return UPDATEPRODUCT;
	}
	@PostMapping("update")
	public String productUpdate(@Valid @ModelAttribute("updateproduct") Product products,Errors error,Model model) {
		if (error.hasErrors()) {
			return UPDATEPRODUCT;
		} else {
			try {
		productService.save(products);
		return LISTOFPRODUCT;
			} catch (Exception e) {
				model.addAttribute("message", ":(Update failed");
			}
			return UPDATEPRODUCT;
		}
	}

	@GetMapping("/findbyproductid")
	public String findProduct(@RequestParam("id") int id, @RequestParam("pId") int pId, Model model) {
		Product product = productService.findByProductId(id);
		model.addAttribute("findproduct", product);
		model.addAttribute("pId", pId);
		return "findbyidproduct";
	}

	

	// CategoryProductDetails

	@GetMapping("/getcategoryproductdetails")
	public String getCategoryProductDetails(@RequestParam("categoryId") int id, Model model) {
		Category category = categoryService.findByCategoryId(id);
		model.addAttribute("getcategory", category);
		model.addAttribute("getproductlist", productService.getProductsByCategoryId(id));
		return "category-product";
	}

	@GetMapping("/cake")
	public String cake(@RequestParam("id") int pId, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("pId", session.getAttribute(PERSONID));
		model.addAttribute("pId", pId);
		return "cake";
	}

	@GetMapping("/cookies")
	public String cookies(@RequestParam("id") int pId, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("pId", session.getAttribute(PERSONID));
		model.addAttribute("pId", pId);
		return "cookies";
	}

	@GetMapping("/cupcakes")
	public String cupcakes(@RequestParam("id") int pId, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("pId", session.getAttribute(PERSONID));
		model.addAttribute("pId", pId);
		return "cupcakes";
	}

	@GetMapping("/chocolates")
	public String chocolates(@RequestParam("id") int pId, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("pId", session.getAttribute(PERSONID));
		model.addAttribute("pId", pId);
		return "chocolates";
	}

	@GetMapping("/donuts")
	public String donuts(@RequestParam("id") int pId, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("pId", session.getAttribute(PERSONID));
		model.addAttribute("pId", pId);
		return "donuts";
	}

	@GetMapping("/muffins")
	public String muffins(@RequestParam("id") int pId, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("pId", session.getAttribute(PERSONID));
		model.addAttribute("pId", pId);
		return "muffins";
	}
}
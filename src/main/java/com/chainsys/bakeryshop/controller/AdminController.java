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

import com.chainsys.bakeryshop.DTO.CategoryProductDTO;
import com.chainsys.bakeryshop.model.Category;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.services.CategoryService;
import com.chainsys.bakeryshop.services.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/productImages";
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;

	@GetMapping("/adminhome")
	public String adminHome() {
		return "admin";
	}

	@GetMapping("/list")
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
		return "redirect:/admin/list";
	}

	@GetMapping("/deletecategory")
	public String deleteCategory(@RequestParam("categoryId") int id) {
		categoryService.deleteCategoryById(id);
		return "redirect:/admin/list";

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
		return "redirect:/admin/list";
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
		Product product = productService.findByCategoryId(id);
		model.addAttribute("updateproduct", product);
		return "update-product";
	}

	@PostMapping("update")
	public String updateProduct(@ModelAttribute("updateproduct") Product product) {
		productService.save(product);
		return "redirect:/admin/productlist";
	}
	
	//CategoryProductDTO
	public String getProductCategory(@RequestParam("id") int id, Model model) {
		
		CategoryProductDTO dto = new CategoryProductDTO();
		model.addAttribute("getcategory",dto.getCategory());
		model.addAttribute("getproductlist",dto.getProduct());
		return "category-product";
	}
}

//     // To upload img in database
//     @PostMapping("/admin/products/add")
//     public String productAddPost(@ModelAttribute("productDTO") ProductDTO productDTO,
//               @RequestParam("productImage") MultipartFile file,
//               @RequestParam("imgName") String imgName) throws IOException {
//          Product product = new Product();
//          product.setProductId(productDTO.getProductId());
//          product.setProductName(productDTO.getProductName());
//          product.setCategoryId(categoryService.updateCategoryById(productDTO.getCategoryId()).get());
//          product.setStockInhand(productDTO.getStockInhand());
//          product.setPrice(productDTO.getPrice());
//          product.setDescription(productDTO.getDescription());
//          product.setImage(productDTO.getImage());
//          
//          String imageUUID;
//          if (!file.isEmpty()) {
//               imageUUID = file.getOriginalFilename();
//               Path fileAndPathName = Paths.get(uploadDir, imageUUID);
//               Files.write(fileAndPathName, file.getBytes());
//          } else {
//               imageUUID = imgName;
//
//          }
//          product.setImage(imageUUID);
//          productService.addproduct(product);
//          return "redirect:/admin/products";
//     }
//     }
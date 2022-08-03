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
	public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/productImages";
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;

	@GetMapping("/adminhome")
	public String adminHome() {
		return "admin";
	}

//     @GetMapping("/admin/categories")
//     public String category(Model model) {
//          model.addAttribute("categories", categoryService);
//          return "categories";
//     }

	@GetMapping("/list")
	public String getcategory(Model model) {
		List<Category> categorylist = categoryService.getCategory();
		model.addAttribute("allcategory", categorylist);
		return "category-list";
	}

//    @GetMapping("/admin/categories/add")
//     public String addCategory(Model model) {
//          model.addAttribute("category", new Category());
//          return "addcategory";
//     }
	@GetMapping("/addcatgoryform")
	public String showAddForm(Model model) {
		Category cat = new Category();
		model.addAttribute("addcategory", cat);
		return "add-category";
	}

//     
//     @PostMapping("/admin/categories/add")
//     public String postCategory(@ModelAttribute("category") Category category) {
//          categoryService.addCategory(category);
//          return "redirect:/admin/categories";
//     }
	@PostMapping("/add")
	public String addNewCategory(@ModelAttribute("addcategory") Category cat) {
		System.out.println(cat);
		categoryService.save(cat);
		return "redirect:/admin/list";
	}

//	@GetMapping("/admin/categories/delete/{id}")
//     public String deleteCategory(@PathVariable("id") int id) {
//          categoryService.deleteCategoryById(id);
//          return "redirect:/admin/categories";
//     }
	@GetMapping("/deletecategory")
	public String deleteCategory(@RequestParam("categoryId") int id) {
		categoryService.deleteCategoryById(id);
		return "redirect:/admin/list";

	}

//	@GetMapping("/admin/categories/update/{id}")
//     public String updateCategoryById(@PathVariable int id, Model model) {
//          Optional<Category> category = categoryService.updateCategoryById(id);
//          if (category.isPresent()) {
//               model.addAttribute("category", category.get());
//               return "addcategory";
//          } else {
//               return "404";
//          }
//     }
	@GetMapping("/update")
	public String showUpdate(@RequestParam("categoryId") int id, Model model) {
		Category cat = categoryService.findById(id);
		model.addAttribute("updatecategory", cat);
		return "update-category";
	}

	@PostMapping("updatecategory")
	public String updateCategory(@ModelAttribute("updatecategory") Category cat) {
		categoryService.save(cat);
		return "redirect:/admin/list";
	}

	// products

//     @GetMapping("/admin/products")
//     public String products(Model model) {
//          model.addAttribute("products", productService.getAllProducts());
//          return "products";
//     }

	@GetMapping("/productlist")
	public String getProduct(Model model) {
		List<Product> productlist = productService.getProduct();
		model.addAttribute("allproduct", productlist);
		return "product-list";
	}

//	 @GetMapping("/admin/products/add")
//     public String addProducts(Model model) {
//          model.addAttribute("productDTO", new ProductDTO());
//          model.addAttribute("categories", categoryService.getAllCategory());
//          return "addproduct";
//     }
	@GetMapping("/addform")
	public String addProduct(Model model) {
		Product prod = new Product();
		model.addAttribute("product", prod);
		return "add-product";
	}

	@PostMapping("/addproduct")
	public String addNewProduct(@ModelAttribute("product") Product prod) {
		productService.save(prod);
		return "redirect:/admin/productlist";
	}

//	  @GetMapping("/admin/product/delete/{id}")
//     public String deleteProduct(@PathVariable("id") long id) {
//          productService.removeProductById(id);
//          return "redirect:/admin/products";
//     }
	@GetMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("id") int id) {
		productService.deleteProductById(id);
		return "redirect:/admin/productlist";
	}

//     @GetMapping("/admin/product/update/{id}")
//     public String updateProduct(@PathVariable("id") long id, Model model) {
//          Product product = productService.getProductsById(id);
//          ProductDTO productDTO = new ProductDTO();
//          productDTO.setProductId(productDTO.getProductId());
//          productDTO.setProductName(productDTO.getProductName());
//          productDTO.setCategoryId(product.getCategoryId().getCategoryId());
//          productDTO.setPrice(product.getPrice());
//          productDTO.setDescription(product.getDescription());
//          productDTO.setImage(product.getImage());
//
//          model.addAttribute("categories", categoryService.getAllCategory());
//          model.addAttribute("productDTO", productDTO);
//
//          return "addproduct";
//     }
	
	@GetMapping("/updateform")
	public String showUpdates(@RequestParam("id") int id, Model model) {
		Product prod = productService.findByCategoryId(id);
		model.addAttribute("updateproduct", prod);
		return "update-product";
	}

	@PostMapping("update")
	public String updateProduct(@ModelAttribute("updateproduct") Product prod) {
		productService.save(prod);
		return "redirect:/admin/productlist";
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
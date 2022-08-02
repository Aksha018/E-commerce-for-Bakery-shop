package com.chainsys.bakeryshop.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.chainsys.bakeryshop.DTO.ProductDTO;
import com.chainsys.bakeryshop.model.Category;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.services.CategoryService;
import com.chainsys.bakeryshop.services.ProductService;

@Controller
public class AdminController {
     public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/productImages";
     @Autowired
     CategoryService categoryService;
     @Autowired
     ProductService productService;

     @GetMapping("/admin")
     public String adminHome() {
          return "admin";
     }

     @GetMapping("/admin/categories")
     public String category(Model model) {
          model.addAttribute("categories", categoryService);
          return "categories";
     }

     @GetMapping("/admin/categories/add")
     public String addCategory(Model model) {
          model.addAttribute("category", new Category());
          return "addcategory";
     }

     @PostMapping("/admin/categories/add")
     public String postCategory(@ModelAttribute("category") Category category) {
          categoryService.addCategory(category);
          return "redirect:/admin/categories";
     }

     @GetMapping("/admin/categories/delete/{id}")
     public String deleteCategory(@PathVariable("id") int id) {
          categoryService.removeCategoryById(id);
          return "redirect:/admin/categories";
     }

     @GetMapping("/admin/categories/update/{id}")
     public String updateCategoryById(@PathVariable int id, Model model) {
          Optional<Category> category = categoryService.updateCategoryById(id);
          if (category.isPresent()) {
               model.addAttribute("category", category.get());
               return "addcategory";
          } else {
               return "404";
          }
     }

     // products

     @GetMapping("/admin/products")
     public String products(Model model) {
          model.addAttribute("products", productService.getAllProducts());
          return "products";
     }

     @GetMapping("/admin/products/add")
     public String addProducts(Model model) {
          model.addAttribute("productDTO", new ProductDTO());
          model.addAttribute("categories", categoryService.getAllCategory());
          return "addproduct";
     }

     // To upload img in database
     @PostMapping("/admin/products/add")
     public String productAddPost(@ModelAttribute("productDTO") ProductDTO productDTO,
               @RequestParam("productImage") MultipartFile file,
               @RequestParam("imgName") String imgName) throws IOException {
          Product product = new Product();
          product.setProductId(productDTO.getProductId());
          product.setProductName(productDTO.getProductName());
          product.setCategoryid(categoryService.updateCategoryById(productDTO.getCategoryId()).get());
          product.setStockInhand(productDTO.getStockInhand());
          product.setPrice(productDTO.getPrice());
          product.setDescription(productDTO.getDescription());
          product.setImage(productDTO.getImage());
          
          String imageUUID;
          if (!file.isEmpty()) {
               imageUUID = file.getOriginalFilename();
               Path fileAndPathName = Paths.get(uploadDir, imageUUID);
               Files.write(fileAndPathName, file.getBytes());
          } else {
               imageUUID = imgName;

          }
          product.setImage(imageUUID);
          productService.addproduct(product);
          return "redirect:/admin/products";
     }

     @GetMapping("/admin/product/delete/{id}")
     public String deleteProduct(@PathVariable("id") long id) {
          productService.removeProductById(id);
          return "redirect:/admin/products";
     }

     @GetMapping("/admin/product/update/{id}")
     public String updateProduct(@PathVariable("id") long id, Model model) {
          Product product = productService.getProductsById(id);
          ProductDTO productDTO = new ProductDTO();
          productDTO.setProductId(productDTO.getProductId());
          productDTO.setProductName(productDTO.getProductName());
          productDTO.setCategoryId(product.getCategoryId().getCategoryId());
          productDTO.setPrice(product.getPrice());
          productDTO.setDescription(product.getDescription());
          productDTO.setImage(product.getImage());

          model.addAttribute("categories", categoryService.getAllCategory());
          model.addAttribute("productDTO", productDTO);

          return "addproduct";
     }
}
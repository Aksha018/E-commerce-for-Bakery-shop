package com.chainsys.bakeryshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.chainsys.bakeryshop.model.Category;
import com.chainsys.bakeryshop.model.Product;


@Controller
public class PersonController {
     @Autowired
     Category categoryService;
     @Autowired
     Product productService;

     @GetMapping("/person")
     public String home(Model model) {
          return "admin";
     }
     @GetMapping("/shop")
     public String shop(Model model) {
          model.addAttribute(categoryService.getCategoryId());
          model.addAttribute(productService.getProductId());
          return "shop";
     }
     @GetMapping("/shop/category")
     public String shopByCategory(Model model, @PathVariable int id) {
          model.addAttribute(categoryService.getCategoryId());
          model.addAttribute( productService.getProductId());
          return "shop";
     }
     @GetMapping("/shop/productlist")
     public String Productlist( Model model, @PathVariable int id) {
          model.addAttribute(productService.getProductId());
          return "productlist";
     }
}
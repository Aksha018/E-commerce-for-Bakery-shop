package com.chainsys.bakeryshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.bakeryshop.dto.PersonOrderDto;
import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Product;
import com.chainsys.bakeryshop.services.OrderService;
import com.chainsys.bakeryshop.services.PersonService;
import com.chainsys.bakeryshop.services.ProductService;
@Controller
@RequestMapping("/person")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	@Autowired
	PersonService personService;
	@Autowired
	ProductService productService;

	
			@GetMapping("/orderlist")
			public String getorderAll(Model model) {
				List<Orders> orderlist = orderService.getOrder();
				model.addAttribute("allorder", orderlist);
				return "order-list";
			}

			@GetMapping("/addorderform")
			public String show(@RequestParam("id")int productId,Model model) {
				Orders theorder = new Orders();
				theorder.setProductId(productId);
				Product product=productService.findByProductId(productId);
				theorder.setPrice((int)product.getPrice());
				model.addAttribute("add", theorder);
				return "add-orders";
			}

			@PostMapping("/addorder")
			public String addNewOrder(@ModelAttribute("add") Orders theorder,HttpSession session) {
				orderService.save(theorder);
				session.setAttribute("orderId", theorder.getOrderId());
				return "redirect:/person/orderlist";
			}

			@GetMapping("/updateorderform")
			public String orderUpdateForm(@RequestParam("id") long id, Model model) {
				Orders theorder = orderService.findByOrderId(id);
				model.addAttribute("update", theorder);
				return "update-order";
			}

			@PostMapping("/updateorder")
			public String updateorder(@ModelAttribute("update") Orders theorder) {
				orderService.save(theorder);
				return "redirect:/person/orderlist";
			}
			@GetMapping("/deleteorder")
			public String deleteorder(@RequestParam("id") long id) {
					orderService.deleteOrderById(id);
				return "redirect:/person/orderlist";
			}
//PersonOrderDTO
			@GetMapping("/getpersonorder")
			public String getPersonOrder(@RequestParam("id") int id, Model model) {
				PersonOrderDto dto=	personService.getPersonOrderDTO(id);
				model.addAttribute("person", dto.getPerson());
				model.addAttribute("order", dto.getOrder());
				return "person-order";
			}

		}

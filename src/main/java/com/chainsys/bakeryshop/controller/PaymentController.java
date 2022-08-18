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

import com.chainsys.bakeryshop.model.Payment;
import com.chainsys.bakeryshop.services.OrderService;
import com.chainsys.bakeryshop.services.PaymentService;

@Controller
@RequestMapping("/person")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	@Autowired
	OrderService orderService;

	@GetMapping("/paymentlist")
	public String getPaymentAll(Model model) {
		List<Payment> paymentlist = paymentService.getPayment();
		model.addAttribute("allpayment", paymentlist);
		return "payment-list";
	}

	@GetMapping("/addpaymentform")
	public String showpayment(Model model) {
		Payment thepayment = new Payment();
		model.addAttribute("add", thepayment);
		return "add-payment";
	}

	@PostMapping("/addpayment")
	public String addNewpayment(@ModelAttribute("add") Payment thepayment) {
		paymentService.save(thepayment);
		return "redirect:/person/paymentlist";
	}

	@GetMapping("/updatepaymentform")
	public String paymentUpdateForm(@RequestParam("id") long id, Model model) {
		Payment thepayment = paymentService.findByPaymentId(id);
		model.addAttribute("updatepay", thepayment);
		return "update-payment";
	}

	@PostMapping("/updatepayment")
	public String paymentupdate(@ModelAttribute("updatepay") Payment thepayment) {
		paymentService.save(thepayment);
		return "redirect:/person/paymentlist";
	}

	@GetMapping("/deletepayment")
	public String deletepayment(@RequestParam("id") long id) {
		paymentService.deletePaymentById(id);
		return "redirect:/person/paymentlist";
	}
}

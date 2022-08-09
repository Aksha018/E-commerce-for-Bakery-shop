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

import com.chainsys.bakeryshop.DTO.PersonOrderDTO;
import com.chainsys.bakeryshop.model.Bill;
import com.chainsys.bakeryshop.model.Orders;
import com.chainsys.bakeryshop.model.Payment;
import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.services.BillService;
import com.chainsys.bakeryshop.services.OrderService;
import com.chainsys.bakeryshop.services.PaymentService;
import com.chainsys.bakeryshop.services.PersonService;

//PERSON
@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService personservice;
	
	@Autowired
	PaymentService paymentService;
	@Autowired
	BillService billservice;
	
	@GetMapping("/index")
	public String index(Model model) 
	{
		Person theperson = new Person();
		model.addAttribute("addperson", theperson);
	return "login";
	}
	@GetMapping("/personlist")
	public String getPersonAll(Model model) {
		List<Person> personlist = personservice.getPerson();
		model.addAttribute("allperson", personlist);
		return "person-list";
	}

	@GetMapping("/addpersonform")
	public String showAdd(Model model) {
		Person theperson = new Person();
		model.addAttribute("addperson", theperson);
		return "add-person";
	}

	@PostMapping("/addperson")
	public String addNewPerson(@ModelAttribute("addperson") Person theperson) {
		personservice.save(theperson);
		return "redirect:/person/personlist";
	}

	@GetMapping("/updatepersonform")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		Person theperson = personservice.findByPersonId(id);
		model.addAttribute("updateperson", theperson);
		return "update-person";
	}

	@PostMapping("/update")
	public String updateperson(@ModelAttribute("updateperson") Person theperson) {
		personservice.save(theperson);
		return "redirect:/person/personlist";
	}

	@GetMapping("/deleteperson")
	public String deleteperson(@RequestParam("id") int id) {
		personservice.deletePersonById(id);
		return "redirect:/person/personlist";
	}
	
		
	
	
	
	
//BILL

	
	
	@GetMapping("/billlist")
	public String getBillDetailsAll(Model model) {
		List<Bill> billlist = billservice.getBill();
		model.addAttribute("allbill", billlist);
		return "bill-list";
	}

	@GetMapping("/addbillform")
	public String showAddForm(Model model) {
		Bill billlist = new Bill();
		model.addAttribute("addbilldetail", billlist);
		return "add-bill";
	}

	@PostMapping("/addbill")
	public String addNewbill(@ModelAttribute("addbilldetail") Bill billlist) {
		billservice.save(billlist);
		return "redirect:/person/billlist";
	}

	@GetMapping("/updatebillform")
	public String showUpdate(@RequestParam("id") long id, Model model) {
		Bill billlist = billservice.findByBillId(id);
		model.addAttribute("updatebill", billlist);
		return "update-bill";
	}

	@PostMapping("/updatebill")
	public String updateBill(@ModelAttribute("update") Bill billlist) {
		billservice.save(billlist);
		return "redirect:/person/billlist";
	}

	@GetMapping("/deletebill")
	public String deleteBill(@RequestParam("id") long id) {
		billservice.deleteBillById(id);
		return "redirect:/person/billlist";
	}
	
//PAYMENT
	

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
	public String updatepayment(@ModelAttribute("updatepay")Payment thepayment) {
		paymentService.save(thepayment);
		return "redirect:/person/paymentlist";
	}

	@GetMapping("/deletepayment")
	public String deletepayment(@RequestParam("id") long id) {
		paymentService.deletePaymentById(id);
		return "redirect:/person/paymentlist";
	}
//	@GetMapping("/getpayment")
//	public String getpayment(@RequestParam("id") int id, Model model) {
//		PersonProductDTO dto = paymentService.getPaymentOrderDTO(id);
//		model.addAttribute("getpayment",dto.getPayment());
//		model.addAttribute("getorder",dto.getOrder());
//		return "person-product-list";
//	}
//	
   
}


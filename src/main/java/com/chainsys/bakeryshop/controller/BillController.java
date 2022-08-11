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

import com.chainsys.bakeryshop.model.Bill;
import com.chainsys.bakeryshop.services.BillService;
import com.chainsys.bakeryshop.services.OrderService;

@Controller
@RequestMapping("/person")
public class BillController {

	@Autowired
	BillService billservice;
	@Autowired
	OrderService orderService;

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
	 
//OrderbBillDTO 
	
	@GetMapping("/getorderbilldetails")
    public String getOrderBillDetails(@RequestParam("orderid") long id, Model model) {
    	model.addAttribute("getorder",orderService.findByOrderId(id));
    	model.addAttribute("getbill",billservice.getBill());
    	return "bill-order";
    }
}

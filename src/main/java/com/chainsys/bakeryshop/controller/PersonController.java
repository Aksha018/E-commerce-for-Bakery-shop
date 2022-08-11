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

import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.services.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService personservice;

	@GetMapping("/login")
	public String index(Model model) {
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
		model.addAttribute("add", theperson);
		return "add-person";
	}

	@PostMapping("/addperson")
	public String addNewPerson(@ModelAttribute("add") Person theperson) {
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
	

}

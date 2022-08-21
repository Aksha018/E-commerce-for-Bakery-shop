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

import com.chainsys.bakeryshop.model.Person;
import com.chainsys.bakeryshop.services.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService personservice;
	@GetMapping("/homepage")
	public String index(Model model)
	{
      return "home";
		}
	@GetMapping("/indexpage")
	public String homePage(Model model)
	{
      return "index";
	}
	
	@GetMapping("/adminindex")
	public String adminPage(Model model)
	{
      return "admin-index";
	}
	
	@GetMapping("/personloginpage")
	public String personLogin(Model model) {
		Person  theperson=new Person();
	    model.addAttribute("uselogin", theperson);
	    return "userlogin";
	}
	
	  @PostMapping("/personlogin") public String
	 checkingAccess(@ModelAttribute("uselogin") Person pers) {
		 Person theperson=personservice.getEmailAndPassword(pers.getEmail(),pers.getPassword()); 
		 if(theperson!=null) {
			 return "redirect:/person/homepage";
	  } else
		  return "Invalid-user-error"; 
		 }
	 

	@GetMapping("/personlist")
	public String getPersonAll(Model model) {
		List<Person> personlist = personservice.getPerson();
		model.addAttribute("allperson", personlist);
		return "person-list";
	}

	@GetMapping("/signup")
	public String showAdd(Model model) {
		Person theperson = new Person();
		model.addAttribute("add", theperson);
		return "signup";
	}

	@PostMapping("/addperson")
	public String addNewPerson(@ModelAttribute("add") Person theperson) {
		personservice.save(theperson);
		return "redirect:/person/indexpage";
	}
	
	@PostMapping("/checkuserlogin")
    public String addNewAdmin(@ModelAttribute("login")Person person,Model model,HttpSession session) {
        Person persons = personservice.getEmailAndPassword(person.getEmail(),person.getPassword());
        if (persons!=null) {
        	if(persons.getPersonType().equalsIgnoreCase("admin"))
        	    return "admin-index";
        	else if(persons.getPersonType().equalsIgnoreCase("user")){
        		session.setAttribute("personId", persons.getPersonId());
        		model.addAttribute("pId", persons.getPersonId());
        		return "home";
        	}else {
        		return "invalid-user-error";
        	}
        }else {
        	return "redirect:/person/personloginpage";
        }
	}
    
    @GetMapping("/updatepersonform")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		Person theperson = personservice.findByPersonId(id);
		model.addAttribute("updateperson", theperson);
		return "update-person";
	}

	@PostMapping("/update")
	public String updateperson(@ModelAttribute("updateperson") Person per) {
		personservice.save(per);
		return "redirect:/person/personlist";
	}

	@GetMapping("/deleteperson")
	public String deleteperson(@RequestParam("id") int id) {
		personservice.deletePersonById(id);
		return "redirect:/person/personlist";
	}
	
	@GetMapping("/about")
	public String about(Model model)
	{
      return "about";
	}
}



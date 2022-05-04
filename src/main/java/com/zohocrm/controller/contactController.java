package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.contact;
import com.zohocrm.services.contactService;

@Controller
public class contactController {
	@Autowired
	private contactService contactservice;

	@RequestMapping("/listallcontacts")
	public String listAllcontacts(ModelMap model) {
		List<contact> contacts= contactservice.findAllcontacts();
		model.addAttribute("contacts", contacts);
		return "contact_result";

	} 
	@RequestMapping("/getcontactById")
	public String gtContactById(@RequestParam("id") long id,ModelMap model) {
		contact contact = contactservice.getcontact(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
		
	}
}

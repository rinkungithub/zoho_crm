package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Lead;
import com.zohocrm.entities.contact;
import com.zohocrm.services.LeadService;
import com.zohocrm.services.contactService;

@Controller
public class LeadController {
	@Autowired
	 private LeadService leadservice;
	@Autowired
	private contactService contactservice;
	
	@RequestMapping("/view")
	public String viewCreateLeadpage() {
		
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadservice.SaveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/listallleads")
	public String listAllLeads(ModelMap model) {
	List<Lead> leads = leadservice.findAllLeads();
	model.addAttribute("leads", leads);
	return "lead_result";

	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead=leadservice.getLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		
		Lead lead = leadservice.getLead(id);
		contact contact= new contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadsource(lead.getLeadsource());
		contact.setMobile(lead.getMobile());
		
		contactservice.savecontact(contact);
		
		leadservice.deleteLead(id);
		List<com.zohocrm.entities.contact> contacts = contactservice.findAllcontacts();
		model.addAttribute("contacts", contacts);
		return "contact_result";
		
		
	}
}

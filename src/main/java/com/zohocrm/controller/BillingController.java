package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Billing;

import com.zohocrm.services.BillingService;


@Controller
public class BillingController {
	@Autowired
	private BillingService billingservice;
	
	
	
@RequestMapping("/one")
	public String generateBill(@ModelAttribute("bill") Billing bill,ModelMap model) {
	
	billingservice.generateoneBill(bill);
	model.addAttribute("bills", bill);
	return "billing_result";
}
@RequestMapping("/generate")
public String listAllbills(ModelMap model) { 
	List<Billing> bills = billingservice.findAllbills();
model.addAttribute("bills", bills);
model.addAttribute("msg","your billing is successfull");
return "billing_result";

}	
	
	
}

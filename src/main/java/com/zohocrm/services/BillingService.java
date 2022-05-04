package com.zohocrm.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.zohocrm.entities.Billing;

@Service
public interface BillingService {
	
	public void generateoneBill(Billing bill);

	

	public List<Billing> findAllbills();

}

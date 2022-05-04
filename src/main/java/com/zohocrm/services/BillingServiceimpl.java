package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repositories.BillingRepository;
import com.zohocrm.entities.Billing;


@Service
public class BillingServiceimpl implements BillingService {

	
	@Autowired
	BillingRepository billingrepo;
	@Override
	public void generateoneBill(Billing bill) {
		billingrepo.save(bill);
		 
	}
	@Override
	public List<Billing> findAllbills() {
		
			List<Billing> bills =billingrepo.findAll();
		
			return bills;
		
		
	}

}

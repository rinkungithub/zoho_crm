package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repositories.contactRepository;
import com.zohocrm.entities.contact;

@Service
public class contactServiceimpl implements contactService {

	
	@Autowired
	private contactRepository contactrepo;
	@Override
	public void savecontact(contact contact) {
		contactrepo.save(contact);

	}

	@Override
	public List<contact> findAllcontacts() {
		List<contact> contacts = contactrepo.findAll();
		return contacts;
	}

	@Override
	public contact getcontact(long id) {
		contact contact = contactrepo.getById(id);
		
		return contact;
	}

}

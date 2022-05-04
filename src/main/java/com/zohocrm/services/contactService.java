package com.zohocrm.services;

import java.util.List;


import com.zohocrm.entities.contact;

public interface contactService {
	public void savecontact(contact contact);

	public List<contact> findAllcontacts();

	public contact getcontact(long id);

}

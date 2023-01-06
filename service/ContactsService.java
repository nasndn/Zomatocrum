package com.zomatocrum.service;

import java.util.List;


import com.zomatocrum.enities.Contact;
import com.zomatocrum.enities.Lead;

public interface ContactsService {

	public void saveContactInfo(Contact contact);

	public List<Contact> listcontacts();

	public Contact getContactInfo(long id);

}

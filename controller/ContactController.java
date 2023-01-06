package com.zomatocrum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrum.enities.Contact;
import com.zomatocrum.enities.Lead;
import com.zomatocrum.service.ContactsService;
import com.zomatocrum.service.LeadsService;

@Controller
public class ContactController {

	
	@Autowired 
	private LeadsService leadService;
	
	@Autowired
	private ContactsService contactService;
	
	@RequestMapping("/saveContact")
	public  String saveContact(@RequestParam("id") long id,ModelMap modelMap) {
		Lead lead= leadService.findLeadById(id);
		Contact contact=new Contact(lead.getFirstName(), lead.getLastName(), lead.getMobile(), 
				                      lead.getEmail(), lead.getLeadSource());
		contactService.saveContactInfo(contact);
		leadService.deleteLeadById(id);
		List<Contact> contacts = contactService.listcontacts();
		modelMap.addAttribute("contacts", contacts);
		return "list_contacts";
		
	}
	@RequestMapping("/listcontacts")
	public String listAllLeads(ModelMap modelMap) {
		List<Contact> contacts = contactService.listcontacts();
		modelMap.addAttribute("contacts", contacts);
		return "list_contacts";
		
	}
}

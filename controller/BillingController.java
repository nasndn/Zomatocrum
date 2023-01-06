package com.zomatocrum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrum.enities.Billing;
import com.zomatocrum.enities.Contact;
import com.zomatocrum.service.BillingService;
import com.zomatocrum.service.ContactsService;

@Controller
public class BillingController {

	@Autowired
	 private ContactsService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String generteBill(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.getContactInfo(id);
		model.addAttribute("contact", contact);
		return "new_bill";
		
	}
	
	@RequestMapping("/createBill")
	public String createBill(Billing bill,ModelMap model) {
		billingService.createBill(bill);
		List<Billing> bills=billingService.listAllBills();
		model.addAttribute("bills", bills);
		return "list_billing";
	}
}

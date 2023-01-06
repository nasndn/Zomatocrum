package com.zomatocrum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrum.enities.Contact;
import com.zomatocrum.enities.Lead;
import com.zomatocrum.service.LeadsService;

@Controller
public class LeadController {
 
	@Autowired
	private LeadsService leadService;
	
	
	@GetMapping("/lead")
	public String viewLeadPage() {
		return "save-lead";
	}
	
	@PostMapping("/save")
	public String saveLead(Lead lead,ModelMap model){
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	
	@RequestMapping("/listleads")
	public String listAllLeads(ModelMap modelMap) {
		List<Lead> leads = leadService.listLeads();
		modelMap.addAttribute("leads", leads);
		return "list_leads";
		
	}
	
	@RequestMapping("/getLead")
	public String getLead(@RequestParam("id")long id,ModelMap modelMap) {
		Lead lead = leadService.findLeadById(id);
		modelMap.addAttribute("lead", lead);
		return "lead_info";
		
	}
	
}

package com.zomatocrum.service;



import java.util.List;

import com.zomatocrum.enities.Lead;

public interface LeadsService {


	public void saveLead(Lead lead);

	public Lead findLeadById(long id);

	public void deleteLeadById(long id);

	public List<Lead> listLeads();



		
	
}

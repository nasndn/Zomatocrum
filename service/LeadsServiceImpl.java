package com.zomatocrum.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrum.enities.Lead;
import com.zomatocrum.repository.LeadRepository;

@Service
public class LeadsServiceImpl implements LeadsService {

	
	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
       leadRepo.save(lead);
	}

	@Override
	  public Lead findLeadById(long id) {
      Optional<Lead> findById = leadRepo.findById(id);
      Lead lead = findById.get();
		return lead;
	}

	@Override
	  public void deleteLeadById(long id) {
         leadRepo.deleteById(id);		
	}

	

	@Override
	public List<Lead> listLeads() {
        List<Lead> leads = leadRepo.findAll();
		
		return leads;		
	}

	

	
}

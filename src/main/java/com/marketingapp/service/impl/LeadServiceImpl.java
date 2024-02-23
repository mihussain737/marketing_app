package com.marketingapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.dto.LeadDto;
import com.marketingapp.entity.Lead;
import com.marketingapp.repository.LeadRepository;
import com.marketingapp.service.LeadService;
import com.marketingapp.util.EmailService;


@Service
public class LeadServiceImpl implements LeadService{
	
	@Autowired
	private LeadRepository leadRepo;
	
	@Autowired
	private EmailService emailService;

	@Override
	public void saveLead(LeadDto leadDto) {
		
		Lead lead=new Lead();
		lead.setId(leadDto.getId());
		lead.setFirstName(leadDto.getFirstName());
		lead.setLastName(leadDto.getLastName());
		lead.setEmail(leadDto.getEmail());
		lead.setMobile(leadDto.getMobile());
		emailService.sendSimpleMailMessage(leadDto.getEmail(),"Test","TestingEmail");
		leadRepo.save(lead);
		
	}

	@Override
	public List<Lead> getLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteLead(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public Lead fndLeadById(long id) {
		 Optional<Lead> lead = leadRepo.findById(id);
		 if(lead.isPresent()) {
			 return lead.get();
		 }
		 return null;
		
		
	}

	@Override
	public void updateLead(LeadDto leadDto) {
		Lead lead =new Lead();
		lead.setId(leadDto.getId());
		lead.setFirstName(leadDto.getFirstName());
		lead.setLastName(leadDto.getLastName());
		lead.setEmail(leadDto.getEmail());
		lead.setMobile(leadDto.getMobile());
		leadRepo.save(lead);
	}

}

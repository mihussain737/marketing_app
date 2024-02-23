package com.marketingapp.service;

import java.util.List;

import com.marketingapp.dto.LeadDto;
import com.marketingapp.entity.Lead;

public interface LeadService {

	void saveLead(LeadDto leadDto);

	List<Lead> getLeads();

	void deleteLead(long id);

	Lead fndLeadById(long id);

	void updateLead(LeadDto leadDto);


}


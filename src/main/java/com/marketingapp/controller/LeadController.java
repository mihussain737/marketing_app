package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketingapp.dto.LeadDto;
import com.marketingapp.entity.Lead;
import com.marketingapp.service.LeadService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class LeadController {
	@Autowired
	private LeadService leadService;

	// http://localhost:8080/viewLeadForm
	@RequestMapping("viewLeadForm")
	public String viewLeadForm() {
		return "leadForm";
	}

	@RequestMapping(value = "/saveLead")
	public String saveLead(@ModelAttribute LeadDto leadDto, Model model) {
		leadService.saveLead(leadDto);
		model.addAttribute("msg", "Lead is saved");
		return "leadForm";
	}
	@RequestMapping("/list_leads")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads=leadService.getLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id") long id,ModelMap model) {
		leadService.deleteLead(id);
		List<Lead> leads=leadService.getLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	
	@RequestMapping("/update")
	public String viewUpdateForm(@RequestParam("id")long id, ModelMap model) {
		Lead lead=leadService.fndLeadById(id);
		model.addAttribute("lead",lead);
		return "updatePage";
	}
	
	@RequestMapping("/updateLead")
	public String updateLead(LeadDto leadDto,ModelMap model) {
		leadService.updateLead(leadDto);
		List<Lead> leads=leadService.getLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}

}

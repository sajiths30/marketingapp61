package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.entity.Lead;
import com.marketingapp.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	//http://localhost:8080/create
	@RequestMapping("/create")
public String viewForm() {
	return "create_lead";
}
	//http://localhost:8080/saveLead
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")   Lead lead,Model model) {
		model.addAttribute("msg", "record is saved");
		leadService.saveLead(lead);
		return "create_lead";
	}
	//http://localhost:8080/listall
	@RequestMapping("/listall")
	public String ListLead(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_lead";
		
	}
	//http://localhost:8080/delete
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id")long id,Model model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_lead";
	}
	//http://localhost:8080/update
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id")long id,Model model) {
		Lead lead = leadService.updateOneLead(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}
	@RequestMapping("/updateLead")
	public String updateLead(Lead lead,Model model) {
		leadService.saveLead(lead);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_lead";
	}
	
}

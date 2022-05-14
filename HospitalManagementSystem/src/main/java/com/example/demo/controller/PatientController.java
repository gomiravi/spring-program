package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Appointment;
import com.example.demo.model.Login;
import com.example.demo.model.Patient;
import com.example.demo.service.Loginservice;
import com.example.demo.service.Patientservice;

@Controller

public class PatientController {
	@Autowired
	private Loginservice loginservice;
	
	@Autowired
	private Patientservice patientservice;
	
	@RequestMapping("Patient/Home")
	public String patienthome()
	{
		return "Patient";
	}
	@RequestMapping("Patient/Book Appointment")
	public String appointment(Model model)
	{	
		model.addAttribute("bookappointment",new Appointment());
		return "BookAppointment";
	}
	
	@RequestMapping(value = "/savepatient", method = RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("") Patient patient)
	{	
		System.out.println(patient.getFname());
		loginservice.save(new Login("patient",patient.getPassword(),patient.getLoginid()));
		patientservice.save(patient);
		return "redirect:/Admin/Home";
	}

}

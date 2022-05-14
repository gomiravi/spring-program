package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.model.Doctor;
import com.example.demo.model.Login;
import com.example.demo.service.Doctorservice;
import com.example.demo.service.Loginservice;

 

@Controller
public class DoctorController implements WebMvcConfigurer {
	@Autowired
	private Doctorservice service;
	
	@Autowired
	private Loginservice rservice;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/AddDoctor").setViewName("AddDoctor");
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDoctor(@Valid @ModelAttribute("doctor") Doctor doctor,BindingResult bg)
	{	if(bg.hasErrors())
	{
		return "AddDoctor";
	}
	else {
		rservice.save(new Login("Doctor",doctor.getPassword(),doctor.getLoginid()));
		service.save(doctor);
		return "redirect:/Admin/Home";
	}
	}
	
	@GetMapping(value = "/Doctor/Home")
	public String Doctorpage()
	{	
		return "Doctor";
	}
	
}

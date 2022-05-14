package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Appointment;
import com.example.demo.service.Appointmentservice;

@Controller
public class AppointmentController {
	@Autowired
	private Appointmentservice appointmentservice;
	
	@RequestMapping(value = "Patient/Book Appointment/saveappointment", method = RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("bookappointment") Appointment bookappointment)
	{	
		bookappointment.setStatus("Not Confirmed");
		Appointmentservice.save(bookappointment);
		return "redirect:/Patient/Home";
	}
	
	
	@RequestMapping("/Notconfirmed")
	public String viewnotconfirmpage(Model model)
	{
		List<Appointment> listnotconfirmed = appointmentservice.notconfirmedlist();
		model.addAttribute("listnotconfirmed",listnotconfirmed);
		return "NotConfirmed";
	}
	@RequestMapping("/confirm/{id}")
	public String confirm(@ModelAttribute Appointment appointment,@PathVariable(name = "id")long id) {
		 appointmentservice.updatestatus(id);
		return "NotConfirmed";
	}
	@RequestMapping("/Confirmed")
	public String viewconfirmpage(Model model)
	{List<Appointment> listconfirmed = appointmentservice.confirmedlist();
	model.addAttribute("listconfirmed",listconfirmed);
	return "ConfirmedAppointments";
		
	}
	
}

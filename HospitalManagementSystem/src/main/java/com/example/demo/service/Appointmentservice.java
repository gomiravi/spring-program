package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;

@Service
@Transactional
public class Appointmentservice {

	@Autowired
	private static AppointmentRepository appointmentrepo;
	
	public static void save(Appointment appointment)
	{
		appointmentrepo.save(appointment);
	}
	public List<Appointment> notconfirmedlist()
	{
		return appointmentrepo.findbyStatus();
		 
	}
	public void updatestatus(long id)
	{
		appointmentrepo.updatestatus(id);
	}
	public List<Appointment> confirmedlist()
	{
		return appointmentrepo.findbyconfirmedStatus();
		 
	}
	
}

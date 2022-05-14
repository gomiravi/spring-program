package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;
@SuppressWarnings("unused")
@Service
@Transactional
public class Patientservice {
	
	@Autowired
	private PatientRepository repo;
	public List<Patient> listall()
	{
		return repo.findAll();
	}

	public void save(Patient patient)
	{
		repo.save(patient);
		
	}
	public Patient get(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}
	public void delete(int id)
	{
		repo.deleteById(id);
	}
}

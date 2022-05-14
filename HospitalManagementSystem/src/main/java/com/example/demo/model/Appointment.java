package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	
	
	@Entity
	@Table(name="appointment")
	public class Appointment {
		@Id
		private long id;
		private String patient_name;
		private String age;
		private String gender;
		private String location;
		private String appointment_time;
		private String phone_number;
		private String doctor_name;
		private String status;
		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Appointment(long id, String patient_name, String age, String gender, String location,
				String appointment_time, String phone_number, String doctor_name, String status) {
			super();
			this.id = id;
			this.patient_name = patient_name;
			this.age = age;
			this.gender = gender;
			this.location = location;
			this.appointment_time = appointment_time;
			this.phone_number = phone_number;
			this.doctor_name = doctor_name;
			this.status = status;
		}
		@Override
		public String toString() {
			return "Appointment [id=" + id + ", patient_name=" + patient_name + ", age=" + age + ", gender=" + gender
					+ ", location=" + location + ", appointment_time=" + appointment_time + ", phone_number="
					+ phone_number + ", doctor_name=" + doctor_name +", status=" + status +"]";
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			int i=100;
			this.id = i;
			 i= i++;
			
		}
		public String getPatient_name() {
			return patient_name;
		}
		public void setPatient_name(String patient_name) {
			this.patient_name = patient_name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getAppointment_time() {
			return appointment_time;
		}
		public void setAppointment_time(String appointment_time) {
			this.appointment_time = appointment_time;
		}
		public String getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}
		public String getDoctor_name() {
			return doctor_name;
		}
		public void setDoctor_name(String doctor_name) {
			this.doctor_name = doctor_name;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			
			this.status = "Not Confirmed";
		}
	}
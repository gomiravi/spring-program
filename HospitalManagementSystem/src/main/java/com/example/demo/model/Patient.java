package com.example.demo.model;

	import javax.persistence.*;
	import javax.persistence.GeneratedValue;
	@Entity
	public class Patient { 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String role;
		private String fname;
		private String lname;
		private String emailid;
		private String bloodgroup;
		private String age;
		private String loginid;
		private String password;
		private String mobilenumber;
		private String Address;
		private String dob;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = "Patient";
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getLoginid() {
			return loginid;
		}
		public void setLoginid(String loginid) {
			this.loginid = loginid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			this.Address= address;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public Patient(int id, String role, String fname, String lname, String emailid, String bloodgroup, String age,
				String loginid, String password, String mobilenumber, String address, String dob) {
			super();
			this.id = id;
			this.role = role;
			this.fname = fname;
			this.lname = lname;
			this.emailid = emailid;
			this.bloodgroup = bloodgroup;
			this.age = age;
			this.loginid = loginid;
			this.password = password;
			this.mobilenumber = mobilenumber;
			this.Address = address;
			this.dob = dob;
		}
		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}

}

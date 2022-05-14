package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long>{
	@Modifying
	@Query(value= "Select a from Appointment a where a.status = 'Not Confirmed'")
	List<Appointment> findbyStatus();
	
	@Modifying
	@Query("update Appointment a set a.status='Confirmed' where a.id=:id")
	void updatestatus(@Param(value="id")long id );
	
	@Modifying
	@Query(value= "Select a from Appointment a where a.status = 'Confirmed'")
	List<Appointment> findbyconfirmedStatus();

}

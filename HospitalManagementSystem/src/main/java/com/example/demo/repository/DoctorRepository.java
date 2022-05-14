package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	 @Modifying
	 @Query("update Doctor d set d.fname=:fname where d.id=:id")
	 void updatedoctor(@Param(value="id")int id,@Param(value="fname")String fname);

}

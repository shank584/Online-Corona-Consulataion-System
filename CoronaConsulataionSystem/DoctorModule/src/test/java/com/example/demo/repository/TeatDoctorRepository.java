package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
@TestMethodOrder(OrderAnnotation.class)
public class TeatDoctorRepository {

//	@Autowired
//	private DoctorRepository drepo;
//	
//	@Test
//	@Order(1)
//	public void testSavDoctor() {
//		
//		Patient p1 = new Patient();
//		p1.setPatient_Name("xyz");
//		
//		Patient p2 = new Patient();
//		p2.setPatient_Name("pqr");
//		
//		
//		
//		Doctor d= new Doctor();
//		d.setDoc_Name("abc");
//		d.setDoc_Phone("7709997372");
//		d.setDoc_City("kwd");
//		d.setDoc_Gender("male");
//		d.setDoc_Department("brain");
//		d.setDoc_Mail("abc@gmail.com");
//		
//		d.setPatients(List.of(p1));
//		d.setPatients(List.of(p2));
//		
//		Doctor saveD= drepo.save(d);
//		System.out.println(d);
//		Assertions.assertThat(saveD).isNotNull();
//	}
//	@Test
//	@Order(2)
//	public void testGetAllDoctor()
//	{
//		List<Doctor> allDoctor=(List<Doctor>)drepo.findAll();
//		System.out.println("Doctor: "+allDoctor);
//		Assertions.assertThat(allDoctor).isNotNull();
//	}
//	
//	@Test
//	public void testGetSingleEmployee()
//	{
//		Optional<Doctor> opt=drepo.findById(1);
//		Doctor doctor=opt.get();
//		System.out.println("Single Employee By ID :"+doctor);
//		Assertions.assertThat(doctor).isNotNull();
//	}
	
	
}

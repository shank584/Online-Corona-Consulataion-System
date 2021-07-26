package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Doctor;
import com.example.demo.exception.myDoctorException;


public interface IDoctorService {

	public Doctor addDoctor(Doctor doctor) throws myDoctorException;
	public List<Doctor>getAllDoctor() throws myDoctorException;
	public Optional<Doctor> getDoctorWithId(Integer doc_id) throws myDoctorException;
	public Doctor getDoctorupdate(Doctor doctor) throws myDoctorException;
	public void deleteDoctor(Integer doc_id) throws myDoctorException;
}

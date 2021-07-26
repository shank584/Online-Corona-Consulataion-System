package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.exception.myDoctorException;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService implements IDoctorService {
	
	private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);
	
	@Autowired
	private DoctorRepository drepo;

	@Override
	public Doctor addDoctor(Doctor doctor) throws myDoctorException {
		// TODO Auto-generated method stub
		logger.info("Adding Doctor in service layer");
		return drepo.save(doctor);
	}
		
	
	

	@Override
	public List<Doctor> getAllDoctor() throws myDoctorException {
		// TODO Auto-generated method stub
		logger.info("getting all doctor info in service layer");
		return drepo.findAll();
	}

	@Override
	public Optional<Doctor> getDoctorWithId(Integer doc_id) throws myDoctorException {
		// TODO Auto-generated method stub
		logger.info("get single doctor with that perticular id");
		return drepo.findById(doc_id);
	}

	@Override
	public Doctor getDoctorupdate(Doctor doctor) throws myDoctorException {
		// TODO Auto-generated method stub
		logger.info("updating doctor in service layer");
		
		Integer docId = doctor.getDoc_Id();
		Optional<Doctor> docFound = getDoctorWithId(docId);
		Doctor updatedDoctor = null;
		if (docFound.isPresent())
			updatedDoctor = drepo.save(doctor);
		
		return updatedDoctor;
	
	}

	@Override
	public void deleteDoctor(Integer doc_id) throws myDoctorException {
		// TODO Auto-generated method stub
		logger.info("deleting doctor from table");
		drepo.deleteById(doc_id);
	}

}

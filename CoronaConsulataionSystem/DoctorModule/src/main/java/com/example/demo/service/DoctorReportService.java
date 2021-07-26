package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.DoctorReport;
import com.example.demo.exception.myDoctorReportException;
import com.example.demo.repository.DoctorReportRepository;

@Service
public class DoctorReportService implements IDoctorReportService {

	private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);
	
	@Autowired
	private DoctorReportRepository drrepo;
	
	@Override
	public DoctorReport addDoctorReport(DoctorReport doctorReport) throws myDoctorReportException {
		// TODO Auto-generated method stub
		logger.info("Adding Doctor report in service layer");
		return drrepo.save(doctorReport);
	}

	@Override
	public List<DoctorReport> getAllDoctorReport() throws myDoctorReportException {
		// TODO Auto-generated method stub
		logger.info("getting all doctor report info in service layer");
		return drrepo.findAll();
	}

	@Override
	public Optional<DoctorReport> getDoctorReportWithId(Integer report_id) throws myDoctorReportException {
		logger.info("get single doctor report with that perticular report id");
		return drrepo.findById(report_id);
	}

	@Override
	public DoctorReport getDoctorReportupdate(DoctorReport doctorReport) throws myDoctorReportException {
		// TODO Auto-generated method stub
		logger.info("updating doctor report in service layer");
		
		Integer repoId = doctorReport.getReport_Id();
		Optional<DoctorReport> docrepoFound = getDoctorReportWithId(repoId);
		DoctorReport updatedDoctorReport = null;
		if (docrepoFound.isPresent())
			updatedDoctorReport = drrepo.save(doctorReport);
		
		return updatedDoctorReport;
	}

	@Override
	public void deleteDoctorReport(Integer report_id) throws myDoctorReportException {
		// TODO Auto-generated method stub
		logger.info("deleting doctor report from table");
		drrepo.deleteById(report_id);
	}

}
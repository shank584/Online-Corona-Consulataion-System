package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.entity.DoctorReport;
import com.example.demo.exception.myDoctorReportException;

public interface IDoctorReportService {
	
	public DoctorReport addDoctorReport(DoctorReport doctorReport) throws myDoctorReportException;
	public List<DoctorReport>getAllDoctorReport() throws myDoctorReportException;
	public Optional<DoctorReport> getDoctorReportWithId(Integer report_id) throws myDoctorReportException;
	public DoctorReport getDoctorReportupdate(DoctorReport doctorReport) throws myDoctorReportException;
	public void deleteDoctorReport(Integer report_id) throws myDoctorReportException;

}

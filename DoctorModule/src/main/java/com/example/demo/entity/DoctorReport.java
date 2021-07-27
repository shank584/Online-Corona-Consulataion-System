package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DoctorReport{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reportId;
	
	@Column
	private Integer docId;
	
	@Column
	private Integer patientId;
	
	@Column
	private String docName;
	
	@Column
	private String patientName;
	
	@Column
	private String patientPrescrition;
	
	@Column
	private String medicineToPatient;
	
	@Column
	private Double docFees;
	
}

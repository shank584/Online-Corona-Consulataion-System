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
	private Integer report_Id;
	
	@Column
	private Integer doc_Id;
	
	@Column
	private Integer patient_Id;
	
	@Column
	private String doc_Name;
	
	@Column
	private String patient_Name;
	
	@Column
	private String patient_Prescrition;
	
	@Column
	private String medicine_To_Patient;
	
	@Column
	private Double doc_Fees;
	
}

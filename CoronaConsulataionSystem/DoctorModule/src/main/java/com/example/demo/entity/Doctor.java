package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="doctor")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doc_Id;
	@Column
	private String doc_Name;
	@Column
	private String doc_Department;
	@Column
	private String doc_Phone;
	@Column
	private String doc_Gender;
	@Column
	private String doc_City;
	@Column
	private String doc_Mail;
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name="doc_id", referencedColumnName = "doc_id")
	List<Patient> patients;

}

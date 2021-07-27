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
	private Integer docId;
	@Column
	private String docName;
	@Column
	private String docDepartment;
	@Column
	private String docPhone;
	@Column
	private String docGender;
	@Column
	private String docCity;
	@Column
	private String docMail;
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name="docId", referencedColumnName = "docId")
	List<Patient> patients;

}

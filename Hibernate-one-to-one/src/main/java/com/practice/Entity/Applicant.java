package com.practice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "APPLICANT")
public class Applicant {

	@Id
	@Column(name = "APPLICANT_NUMBER", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicantNumber;

	@Column(name = "APPLICANT_NAME")
	private String applicantName;
	@Column(name = "APPLICANT_ADDRESS")
	private String applicantAddress;
	@Column(name = "APPLICANT_CONTACT_NUMBER")
	private long applicantContactNumber;

	@OneToOne
	@JoinColumn(name = "PASSPORT_NUMBER")
	Passport passport;

	public Applicant() {
		super();
	}

	public Applicant(int applicantNumber, String applicantName, String applicantAddress, long applicantContactNumber,
			Passport passport) {
		super();
		this.applicantNumber = applicantNumber;
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
		this.applicantContactNumber = applicantContactNumber;
		this.passport = passport;
	}

	public int getApplicantNumber() {
		return applicantNumber;
	}

	public void setApplicantNumber(int applicantNumber) {
		this.applicantNumber = applicantNumber;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public long getApplicantContactNumber() {
		return applicantContactNumber;
	}

	public void setApplicantContactNumber(long applicantContactNumber) {
		this.applicantContactNumber = applicantContactNumber;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Applicant [applicantNumber=" + applicantNumber + ", applicantName=" + applicantName
				+ ", applicantAddress=" + applicantAddress + ", applicantContactNumber=" + applicantContactNumber
				+ ", passport=" + passport + "]";
	}
	
	

}

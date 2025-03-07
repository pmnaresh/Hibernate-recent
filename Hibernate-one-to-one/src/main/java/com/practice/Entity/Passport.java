package com.practice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PASSPORT")
public class Passport {

	@Id
	@Column(name = "PASSPORT_NUMBER", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passportNumber;

	@Column(name = "PASSPORT_ISSUE_LOCATION")
	private String passportIssueLocation;

	public Passport() {
	}

	public Passport(int passportNumber, String passportIssueLocation) {
		super();
		this.passportNumber = passportNumber;
		this.passportIssueLocation = passportIssueLocation;
	}

	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPassportIssueLocation() {
		return passportIssueLocation;
	}

	public void setPassportIssueLocation(String passportIssueLocation) {
		this.passportIssueLocation = passportIssueLocation;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", passportIssueLocation=" + passportIssueLocation + "]";
	}

}

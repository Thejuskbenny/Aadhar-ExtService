package com.extserviceApplication.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="aadhar_master")
public class AadharMaster {

	
	private static final long serialVersionUID=1L;
	
	@Id
	@Column(length = 12 , name = "aadharId")
	private String aadharId;
	
	@Column(length = 25 , nullable = false, name = "firstName")
	private String firstName;
	@Column(length = 25 , nullable = false, name = "lastName")

	
	private String lastName;
	@Column(length = 10 , name = "phoneNo")
	private String phoneNo;
	@Column(length = 50 , nullable = false, name = "address")
	private String address;
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AadharMaster [aadharId=" + aadharId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(aadharId, address, firstName, lastName, phoneNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AadharMaster other = (AadharMaster) obj;
		return Objects.equals(aadharId, other.aadharId) && Objects.equals(address, other.address)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(phoneNo, other.phoneNo);
	}
	
	
}

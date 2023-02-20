package com.extserviceApplication.dto;

import com.extserviceApplication.entity.AadharMaster;

public class AadharDTO {

	private static final long serialVersionUID=1L;
	private String aadharId;
	private String firstName;
	private String lastName;
	private String phoneNo;
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
	
	private boolean aadharvalid;
	
	public boolean isAadharValid()
	{
		return this.aadharvalid;

	}

	public void setAadharValid(boolean aadharvalid)
	{
		this.aadharvalid=aadharvalid;
		
	}
	@Override
	public String toString() {
		return "AadharDTO [aadharId=" + aadharId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + ", address=" + address + ", aadharvalid=" + aadharvalid + "]";
	}
	
	public AadharMaster prepareEntity(AadharDTO dto)
	{
		AadharMaster entity = new AadharMaster();
		entity.setAadharId(dto.getAadharId());
		entity.setAddress(dto.getAddress());
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setPhoneNo(dto.getPhoneNo());
		
		return entity;
		
	}
	
	
	
	public static AadharDTO prepareDTO(AadharMaster entity)
	{
		AadharDTO dto = new AadharDTO();
		dto.setAadharId(entity.getAadharId());;
		dto.setAddress(entity.getAddress());
		dto.setFirstName(dto.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setPhoneNo(entity.getPhoneNo());;
		
		return dto;
		
	}
}

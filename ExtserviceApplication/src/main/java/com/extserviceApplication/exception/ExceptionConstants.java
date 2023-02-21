package com.extserviceApplication.exception;

public enum ExceptionConstants {

	CUSTOMER_FIRSTNAME_INVALID("customer.firstname.invalid"),
	
	CUSTOMER_LASTNAME_INVALID("customer.lastname.invalid"),
	
	CUSTOMER_PHONE_INVALID("customer.phone.invalid"),
	
	CUSTOMER_ADDRESS_INVALID("customer.address.invalid"),
	
	CUSTOMER_PHONE_LENGTH_INVALID("customer.phone.length.invalid"),
	
	CUSTOMER_AADHAR_FORMAT_INVALID("customer.aadhar.format.invalid"),
	
	CUSTOMER_AADHAR_INVALID("customer.aadhar.invalid"),
	
	VALIDATION_FAILED("validation.failed"),
	
	INPUT_PARAM_MISSING("input.param.missing"),
	
	SERVER_ERROR("server.error"),
	
	CUSTOMER_IFSC_CODE_NOTFOUND("customer.ifsc.code.notfound");
	
	
	private final String type;

	private ExceptionConstants(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type;
	}
}

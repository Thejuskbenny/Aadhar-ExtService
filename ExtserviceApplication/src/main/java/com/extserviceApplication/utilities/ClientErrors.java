package com.extserviceApplication.utilities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClientErrors implements Serializable{

	
	List<ClientErrorInfo> errors;
	
	private static final long serialVersionUID = 1L;
	
	public ClientErrors()
	{
		super();
	}
	
	public ClientErrors(String errorCode, String errorMessage)
	{
		super();
		errors = new ArrayList<ClientErrorInfo>();
		
		errors.add(new ClientErrorInfo(errorCode, errorMessage));
		
	}
	
	public void addError(String errorCode, String errorMessage) {
		if(errors==null) {
			errors= new ArrayList<ClientErrorInfo>();
		}
		errors.add(new ClientErrorInfo(errorCode, errorMessage));
	}

	public List<ClientErrorInfo> getErrors() {
		return errors;
	}

	public void setErrors(List<ClientErrorInfo> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "ClientErrors [errors=" + errors + "]";
	}
	
	
}


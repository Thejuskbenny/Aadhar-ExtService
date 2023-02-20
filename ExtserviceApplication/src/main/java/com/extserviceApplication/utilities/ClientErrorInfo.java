package com.extserviceApplication.utilities;

import java.io.Serializable;

public class ClientErrorInfo implements Serializable{

	String code;
	String message;
	
	private static final long serialVersionUID = 1L;

	public ClientErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientErrorInfo(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ClientErrorInfo [code=" + code + ", message=" + message + "]";
	}
	
	
}

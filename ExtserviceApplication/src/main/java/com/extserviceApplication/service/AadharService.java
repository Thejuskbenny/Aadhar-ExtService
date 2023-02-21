package com.extserviceApplication.service;

import com.extserviceApplication.dto.AadharDTO;
import com.extserviceApplication.exception.ExternalServiceException;

public interface AadharService {

	
	public boolean isAadharValid(String aadharId,String firstName, String lastName) throws ExternalServiceException;
	
	public AadharDTO getAadharDetails(String phoneNo);
	
	public AadharDTO updateAddress(String aadharId, AadharDTO address) throws Exception;
}

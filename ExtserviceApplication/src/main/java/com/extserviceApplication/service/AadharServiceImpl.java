package com.extserviceApplication.service;

import java.util.Optional;

import com.extserviceApplication.dto.AadharDTO;
import com.extserviceApplication.entity.AadharMaster;
import com.extserviceApplication.exception.ExternalServiceException;

public class AadharServiceImpl implements AadharService {

	@Override
	public boolean isAadharValid(String aadharId, String firstName, String lastName) throws ExternalServiceException {
		// TODO Auto-generated method stub
		Optional<AadharMaster> aadhar = null;
		return false;
	}

	@Override
	public AadharDTO getAadharDetails(String phoneNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AadharDTO updateAddress(String aadharId, AadharDTO address) throws Exception {
		// TODO Auto-generated method stub
		Optional<AadharMaster> aadhar = null;
		
		return null;
	}

}

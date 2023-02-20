package com.extserviceApplication.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.extserviceApplication.exception.ExceptionConstants;

@ControllerAdvice
public class ExceptionControllerAdvice {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private MessageSource messageSource;
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ClientErrors exceptionHandler(Exception ex)
	{
		logger.info(ex.getMessage(), ex);
		
		String errorCode = ExceptionConstants.SERVER
	}
}

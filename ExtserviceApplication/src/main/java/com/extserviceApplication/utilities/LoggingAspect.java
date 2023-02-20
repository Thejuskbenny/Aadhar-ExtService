package com.extserviceApplication.utilities;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Around("execution(* com.extserviceApplication..*..*(..))")
	public Object logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable{
		
		long startTime = System.currentTimeMillis();
		String className = joinPoint.getSignature().getDeclaringTypeName();
		String methodName=joinPoint.getSignature().getName();
		
		logger.info(className + "----" + methodName +"----"+"Entering into "+methodName+"with param " +Arrays.toString(joinPoint.getArgs()));
		
		Object result = joinPoint.proceed();
		
		long endTime = System.currentTimeMillis();
		
		logger.info(className + "----" + methodName +"----"+"Exiting "+methodName+"with result " +result 
				+"---execution completed in " + (endTime-startTime)+" ms");
		return result;
	}
	

}

package com.extserviceApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class ExtserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtserviceApplication.class, args);
	}

	@Bean
	public MessageSource messagesource() {
		ReloadableResourceBundleMessageSource messageSource= new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
	
	@Bean
	LocalValidatorFactoryBean getValidator()
	{
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messagesource());
		return bean;
	}
}

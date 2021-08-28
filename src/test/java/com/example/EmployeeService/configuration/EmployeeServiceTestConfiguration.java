package com.example.EmployeeService.configuration;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.EmployeeService.service.EmployeeService;

@Profile("test")
@Configuration
public class EmployeeServiceTestConfiguration {
	@Bean
	   @Primary
	   public EmployeeService productService() {
	      return Mockito.mock(EmployeeService.class);
	   }
}

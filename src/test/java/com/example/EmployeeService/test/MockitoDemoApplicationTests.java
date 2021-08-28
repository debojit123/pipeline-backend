package com.example.EmployeeService.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.EmployeeService.service.EmployeeService;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class MockitoDemoApplicationTests {
   @Autowired
   private EmployeeService employeeService;
   
   @Test
   public void employeeRetrievew() {
      System.out.println("Pasdsed");
   }
}
package com.nsp.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan({"io.msela"})
//@EntityScan("io.msela.springbootstarter")
public class NationalScholarshipPortalApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(NationalScholarshipPortalApplication.class, args);
		
		System.out.println("App Started.........");

		
		
	
	}

}

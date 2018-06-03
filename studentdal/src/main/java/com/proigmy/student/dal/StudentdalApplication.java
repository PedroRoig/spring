package com.proigmy.student.dal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class StudentdalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdalApplication.class, args);
	}
}

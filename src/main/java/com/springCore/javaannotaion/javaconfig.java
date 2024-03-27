package com.springCore.javaannotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {

	@Bean(name = "temp") // we can provide more than one name - @Bean(name = {"temp", "stu"})
	public samosa getSamosa() {
		return new samosa();
	}

	@Bean
	public student getStudent() {
		student student = new student(getSamosa());
		return student;
	}
}

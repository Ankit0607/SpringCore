package com.springCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "example [subject=" + subject + "]";
	}

	public example() {
		super();
		// TODO Auto-generated constructor stub
	}

	// here we are using annotation for the intit method add the dependency in the pom for this in 
	@PostConstruct
	public void start() {
		System.out.println("Within the example init method");
	}
	
	// same here we are using the annotation for initialising the destroy method 
	@PreDestroy
	public void end() {
		System.out.println("Withnin the example destroy method");
	}
}

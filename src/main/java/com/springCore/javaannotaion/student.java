package com.springCore.javaannotaion;

import org.springframework.stereotype.Component;

@Component
public class student {

	private samosa samosa;

	public samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(samosa samosa) {
		this.samosa = samosa;
	}

	public student(com.springCore.javaannotaion.samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		System.out.println("I am studying ");
		this.samosa.display();
	}
}

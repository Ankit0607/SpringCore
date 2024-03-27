package com.springCore.javaannotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
		student student = (student) context.getBean("getStudent");
		System.out.println(student);
		student.study();

	}
}

package com.springCore1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		Student student3 = (Student)context.getBean("list");
		System.out.println(student2);
		System.out.println(student1);
		System.out.println(student3);
	}
}

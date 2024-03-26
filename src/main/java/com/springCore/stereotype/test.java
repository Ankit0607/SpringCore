package com.springCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/stereotype/config.xml");

		student stu = (student) context.getBean("student", student.class);
		System.out.println(stu);

	}

}

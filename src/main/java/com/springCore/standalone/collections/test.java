package com.springCore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springCore/standalone/collections/standalonecollectionconfig.xml");
		person person2 = (person)context.getBean("person1", person.class);
		System.out.println(person2);
		System.out.println(person2.getFriends().getClass().getName());
		
	}

}

package com.data.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/data/autowiring/xml/config.xml");
		Student st = ac.getBean("stud", Student.class);
		System.out.println(st);
		
	}
}

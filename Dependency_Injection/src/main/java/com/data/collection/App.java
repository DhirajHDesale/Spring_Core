package com.data.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/data/collection/config.xml");
		Student st = ac.getBean("st1", Student.class);
		System.out.println(st);
	}
}

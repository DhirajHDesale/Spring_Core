package com.data.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/data/primitive/config.xml");
		Student st = ac.getBean("st1", Student.class);
		Student st2 = ac.getBean("st2", Student.class);
		System.out.println(st);
		System.out.println(st2);
	}
}

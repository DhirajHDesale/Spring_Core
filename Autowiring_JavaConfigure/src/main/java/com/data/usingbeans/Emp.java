package com.data.usingbeans;

import org.springframework.stereotype.Component;

@Component
public class Emp {
	private int id = 23;
	private String name = "Kiran";
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}

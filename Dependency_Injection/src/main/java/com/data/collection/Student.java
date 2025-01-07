package com.data.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private List<String> city;
	private Set<String> phoneNo;
	private Map<String, String> course;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", phoneNo=" + phoneNo + ", course=" + course
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public Set<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Set<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

}

package edu.bu.met.cs665;

import java.util.List;

public class Student implements UniversityMemeber {

	private String name;
	public List<String> courses;

	
	
	@Override
	public void accept(UniversityMemberVisitor visitor) {
		visitor.visit(this);
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}



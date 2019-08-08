package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * A main method to run examples.
	 *
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {

		
		// Create a Student object and set values 
		Student student1 = new Student();
		student1.setName("John Doe");
		List<String> courseList1 = new ArrayList<String>();
		courseList1.add("CS555"); courseList1.add("CS665");
		
		student1.setCourses( courseList1);

		
		// Create a Teaching Assistant Student object and set values
		TeachingAssistant student2 = new TeachingAssistant();
		
		student2.setName("Matt Doe");
		student2.setCourses(courseList1);
		student2.setSalary(3000.00f);
		
		
		// Create a Staff Member
		Staff staff=new Staff(); 
		staff.setName("Julia Doe");
		staff.setSalary(6000f);
		
		
		// Create a Faculty Member. 
		Faculty faculty=new Faculty(); 
		
		faculty.setName("Max Mastermann");
		faculty.setSalary(18000f);

		
		
		// Now Let us go and visit them. 
		student1.accept(new CourseVisitor());
		student1.accept(new SalaryVisitor());
		
		student2.accept(new CourseVisitor());
		student2.accept(new SalaryVisitor());

		
		staff.accept(new CourseVisitor());
		staff.accept(new SalaryVisitor());

		
		faculty.accept(new CourseVisitor());
		faculty.accept(new SalaryVisitor());

		
		
		
	}

}

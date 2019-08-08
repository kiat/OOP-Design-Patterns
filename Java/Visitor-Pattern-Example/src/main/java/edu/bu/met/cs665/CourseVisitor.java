package edu.bu.met.cs665;

public class CourseVisitor implements UniversityMemberVisitor {

	@Override
	public void visit(Student person) {
		for (String course : person.getCourses()) {
			System.out.println("Student " + person.getName() + " has the course " + course);
		}
	}

	@Override
	public void visit(TeachingAssistant person) {
		for (String course : person.getCourses()) {
			System.out.println("Student " + person.getName() + "is a Teaching assistant and has the course " + course);
		}
	}

	@Override
	public void visit(Faculty person) {
		System.out.println("Faculty member " + person.getName() + " has no course. ");
	}

	@Override
	public void visit(Staff person) {
		System.out.println("Staff member " + person.getName() + " has no course. ");
	}

}

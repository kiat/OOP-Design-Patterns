package edu.bu.met.cs665;

public class SalaryVisitor implements UniversityMemberVisitor {

	
	@Override
	// Student has no salary
	public void visit(Student person) {
			System.out.println("Student " + person.getName() + " has no Salary");
	}

	@Override
	// TA has salary without TAX
	public void visit(TeachingAssistant person) {
		System.out.println("Student " + person.getName() + " has salary payment "+ person.getSalary());
	}

	@Override
	// Faculty members have to pay high tax. 
	public void visit(Faculty person) {
		System.out.println("Faculty member " + person.getName() + " has salary payment "+ 0.7 * person.getSalary());
	}

	@Override
	public void visit(Staff person) {
		System.out.println("Staff member " + person.getName() + " has salary payment "+ 0.8 * person.getSalary());
	}

}

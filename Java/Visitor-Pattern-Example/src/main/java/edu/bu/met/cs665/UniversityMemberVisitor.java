package edu.bu.met.cs665;

public interface UniversityMemberVisitor {

	
	public void visit(Student student);
	public void visit(TeachingAssistant ta);
	public void visit(Faculty faculty);
	public void visit(Staff staff);
	
	
}

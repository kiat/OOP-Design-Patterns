package edu.bu.met.cs665;

public class Staff implements UniversityMemeber{

	private String name; 
	private float salary;

	
	@Override
	public void accept(UniversityMemberVisitor visitor) {
		visitor.visit(this);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public float getSalary() { 
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	} 
	

}

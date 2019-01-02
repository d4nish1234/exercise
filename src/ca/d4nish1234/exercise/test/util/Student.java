package ca.d4nish1234.exercise.test.util;

public class Student extends Person{
	  public double gpa;

	  public Student(String firstName, String lastName, int age, double gpa) {
		super(firstName,lastName, age);
	    this.gpa = gpa;
	  }

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", toString()=" + super.toString() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}

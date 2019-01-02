package ca.d4nish1234.exercise.test.util;

import java.util.Arrays;
import java.util.List;

public class Person{
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	private String firstName;
	private String lastName;
	private int age;
	public Person (String firstName, String lastName, int age){
		super();
		this.firstName= firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static List<Person> createTestPersons() {
		return Arrays.asList(
				new Person("Charles", "Boss", 25),
				new Person("Dom", "Champion", 43),
				new Person("Erwin", "Joe", 63),
				new Person("Dan", "Man", 19),
				new Person("Boston", "Cake", 24)
				);
		
	}
}


package ca.d4nish1234.exercise.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import ca.d4nish1234.exercise.test.util.Person;

public class LamdaTest {

	public static void main(String[] args) {
		List<Person> people = Person.createTestPersons();
		
		List<Person> people2 = Person.createTestPersons();

		
		// *************Java 7 Style******************
		// Exercise 1: sort the list by last name
		
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
 
		// create a method that prints all elements in the list
		printPersons(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return true;
			}
		});
		// create a method that prints all people that have last name beginning with C
		
		printPersons(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return  (p.getLastName().toUpperCase().startsWith("C"));
			}
		});
		
		// *************Java 8 Lambda Style******************
		
		System.out.println("Java 8 style");
		// Exercise 1: sort the list by last name
		
		Collections.sort(people2,(o1,o2) -> {
				return o1.getLastName().compareTo(o2.getLastName());
		});		
		// create a method that prints all elements in the list
		
		printPersons2(people2, (person) -> true);
		// create a method that prints all people that have last name beginning with C
//		printPersons2(people2, p -> p.getLastName().toUpperCase().startsWith("C"));
		people2.stream().filter(p -> p.getLastName().toUpperCase().startsWith("C")).forEach(System.out::println);
		
		
		System.out.println("Use lambda filter of age <40");
		Stream<Person> a2 = people2.stream().filter(p-> p.getAge()<40);
		
		a2.forEach(System.out::println);
		
	}
	private static void printPersons(List<Person> people, Condition condition) {
		for (Person p: people) {
			if (condition.test(p)) {
				System.out.println(p + " ");
			}
		}
		System.out.println();
	}
	
	private static void printPersons2(List<Person> people, Predicate<Person> predicate) {
		
		people.forEach(p -> {
				if (predicate.test(p)) {	
					System.out.println(p);
				}
			});
//		for (Person p: people) {
//			if (predicate.test(p)) {
//				System.out.println(p + " ");
//			}
//		}
		System.out.println();
	}
	
	
	@FunctionalInterface
	interface Condition{
		public boolean test(Person p);
	}
}


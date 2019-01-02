package ca.d4nish1234.exercise.test;

import java.util.function.Supplier;

import ca.d4nish1234.exercise.test.util.Person;
import ca.d4nish1234.exercise.test.util.Student;

public class LambdaSupplierTest {

	public static void main(String[] args) {

		Supplier<Person> studentGenerator = LambdaSupplierTest::employeeMaker; // this is exactly the same as () -> employeeMaker()
	    for (int i = 0; i < 10; i++) {
	        System.out.println("#" + i + ": " + studentGenerator.get());
	      }
	}
	 public static Student employeeMaker() {
		    return new Student("","",0,2);
		  }
}

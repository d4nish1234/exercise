package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class E3_6_AnimalShelter {

	public static void main(String[] args) {
		AnimalShelter animalShelter = new AnimalShelter();
		
		System.out.println("first test...");
		
		animalShelter.Enqueue(new Dog());
		animalShelter.Enqueue(new Cat());
		animalShelter.Enqueue(new Cat());
		animalShelter.Enqueue(new Cat());
		System.out.println(animalShelter.DequeueAny());
		System.out.println(animalShelter.DequeueAny());
		System.out.println(animalShelter.DequeueAny());
		System.out.println(animalShelter.DequeueAny());
		
		System.out.println("second test...");
		animalShelter.Enqueue(new Dog());
		animalShelter.Enqueue(new Cat());
		animalShelter.Enqueue(new Cat());
		animalShelter.Enqueue(new Cat());
		System.out.println(animalShelter.DequeueCat());
		System.out.println(animalShelter.DequeueCat());
		System.out.println(animalShelter.DequeueDog());
		System.out.println(animalShelter.DequeueCat());
		
		
	}
}

class Animal{
	private LocalDateTime localDateTime;

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "Animal [localDateTime=" + localDateTime + "]";
	}
	
	
}
class Dog extends Animal{

	@Override
	public String toString() {
		return "Dog [getLocalDateTime()=" + getLocalDateTime() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}

class Cat extends Animal{

	@Override
	public String toString() {
		return "Cat [getLocalDateTime()=" + getLocalDateTime() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
class AnimalShelter {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	
	public Animal DequeueAny() {
		if (cats.isEmpty()) {
			return DequeueDog();
		}
		
		if (dogs.isEmpty()) {
			return DequeueCat();
		}
		return (cats.peek().getLocalDateTime().isBefore(dogs.peek().getLocalDateTime()))? DequeueCat(): DequeueDog();
		
	}
	
	public Dog DequeueDog() {
		return dogs.remove();
	}
	
	public Cat DequeueCat() {
		return cats.remove();
	}
	
	public void Enqueue(Animal a) {
		a.setLocalDateTime(LocalDateTime.now());
		
		if (a instanceof Cat) {
			cats.add((Cat)a);
		}
		if (a instanceof Dog) {
			dogs.add((Dog)a);
		}
	}

	@Override
	public String toString() {
		return "AnimalShelter [dogs=" + dogs + ", cats=" + cats + "]";
	}
	
}

package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedList;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedListNode;

public class E2_4_SinglyLinkedListPartition {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.populateTestData();
		ll.add(new SinglyLinkedListNode(1));
		ll.add(new SinglyLinkedListNode(1));
		System.out.print("before partition ");ll.printMyLinkedList();
		System.out.println("was partition successful? " + ll.partition(8));
		System.out.print("after partition ");ll.printMyLinkedList();
		
	}
	
}

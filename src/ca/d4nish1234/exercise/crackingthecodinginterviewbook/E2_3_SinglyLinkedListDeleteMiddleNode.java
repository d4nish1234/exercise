package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedList;

public class E2_3_SinglyLinkedListDeleteMiddleNode {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.populateTestData();
		ll.deleteNode(1);
		ll.deleteNode(5);
		ll.deleteNode(8);
		ll.printMyLinkedList();
		deleteMiddleNode(ll);
		ll.printMyLinkedList();
	}

	static private void deleteMiddleNode(SinglyLinkedList ll) {
		ll.deleteNode(ll.length()/2);
		
	}
}

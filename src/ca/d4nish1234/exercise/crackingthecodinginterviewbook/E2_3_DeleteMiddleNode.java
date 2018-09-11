package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.MySinglyLinkedList;

public class E2_3_DeleteMiddleNode {

	public static void main(String[] args) {
		MySinglyLinkedList ll = new MySinglyLinkedList();
		ll.populateTestData();
		ll.deleteNode(1);
		ll.deleteNode(5);
		ll.deleteNode(8);
		ll.printMyLinkedList();
		deleteMiddleNode(ll);
		ll.printMyLinkedList();
	}

	static private void deleteMiddleNode(MySinglyLinkedList ll) {
		ll.deleteNode(ll.length()/2);
		
	}
}

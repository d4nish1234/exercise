package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedList;

// incorrect solution. Only access to that node was given not the linked list! so it should be a method that
// takes a node and you make the next node into current and delete the next node. (notpossible if we need to do this
// for the last node
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

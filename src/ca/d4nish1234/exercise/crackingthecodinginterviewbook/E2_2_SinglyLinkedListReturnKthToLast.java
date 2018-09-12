package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.MySinglyLinkedList;

public class E2_2_SinglyLinkedListReturnKthToLast {

	public static void main(String[] args) {
		MySinglyLinkedList ll = new MySinglyLinkedList();
		ll.populateTestData();
		ll.printMyLinkedList();
		ll.returnKthToLast(8);
		ll.printMyLinkedList();
	}
}

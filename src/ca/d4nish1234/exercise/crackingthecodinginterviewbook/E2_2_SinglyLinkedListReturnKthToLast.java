package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedList;

public class E2_2_SinglyLinkedListReturnKthToLast {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.populateTestData();
		ll.printMyLinkedList();
		ll.returnKthToLast(8);
		ll.printMyLinkedList();
	}
}

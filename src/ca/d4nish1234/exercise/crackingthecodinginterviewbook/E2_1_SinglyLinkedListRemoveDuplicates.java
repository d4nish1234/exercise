package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedList;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedListNode;

public class E2_1_SinglyLinkedListRemoveDuplicates {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		SinglyLinkedList ll2 = new SinglyLinkedList();
		
		ll.add(new SinglyLinkedListNode (225));	ll.add(new SinglyLinkedListNode (225));	ll.add(new SinglyLinkedListNode (225));	ll.add(new SinglyLinkedListNode (225));
		ll.printMyLinkedList();
		ll.removeDuplicates();
		ll.printMyLinkedList();
		
		ll2.add(new SinglyLinkedListNode (3));ll2.add(new SinglyLinkedListNode (1));	ll2.add(new SinglyLinkedListNode (2));	ll2.add(new SinglyLinkedListNode (3));	ll2.add(new SinglyLinkedListNode (3));ll2.add(new SinglyLinkedListNode (3));ll2.add(new SinglyLinkedListNode (3));
		ll2.printMyLinkedList();
		ll2.removeDuplicates();
		ll2.printMyLinkedList();
		
	}

}




package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.HashSet;
import java.util.Set;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedList;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedListNode;

public class E2_8_SinglyLinkedListLoopDetection {

	public static void main(String[] args) {

		SinglyLinkedList ll = new SinglyLinkedList();
//		ll.populateTestData();
		ll.addSingleChars("123");
		ll.printMyLinkedList();
		SinglyLinkedListNode corruptNode = new SinglyLinkedListNode(1);
		corruptNode.setNextNode(ll.getFirstNode());
		ll.add(corruptNode);
		loopDetection(ll);
	}
	/*
	 * not correct!
	 * use the slow runner and fast runner concept
	 * when fast runner enters the loop it is loop size - k steps behind slow runner 
	 * who is k steps in
	 * 
	 * use this to identify the collision and then move slow to head and increment both slow and fast
	 * until they meet.
	 */
	private static void loopDetection(SinglyLinkedList ll) {
		
		Set<SinglyLinkedListNode> llNodeReference = new HashSet<SinglyLinkedListNode>();
		SinglyLinkedListNode node = ll.getFirstNode();
		if (node ==null) {
			return;
		}
		
		do {
			if (llNodeReference.contains(node)) {
				System.out.println("found circular (corrupt) node: " + node.getNodeValue());
				return;
			}else {
				llNodeReference.add(node);
			}
				
			node = node.getNextNode();
		}while (node!=null);
		System.out.println("no circular references found");
	}
}

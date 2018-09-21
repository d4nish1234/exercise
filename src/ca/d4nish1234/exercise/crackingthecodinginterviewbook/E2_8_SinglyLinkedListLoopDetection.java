package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.HashSet;
import java.util.Set;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.MySinglyLinkedList;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedListNode;

public class E2_8_SinglyLinkedListLoopDetection {

	public static void main(String[] args) {

		MySinglyLinkedList ll = new MySinglyLinkedList();
//		ll.populateTestData();
		ll.addSingleChars("123");
		ll.printMyLinkedList();
		SinglyLinkedListNode corruptNode = new SinglyLinkedListNode(1);
		corruptNode.setNextNode(ll.getFirstNode());
		ll.add(corruptNode);
		loopDetection(ll);
	}
	private static void loopDetection(MySinglyLinkedList ll) {
		
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

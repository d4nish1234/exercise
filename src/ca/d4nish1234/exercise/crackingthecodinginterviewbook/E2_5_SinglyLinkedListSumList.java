package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.Arrays;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.MySinglyLinkedList;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedListNode;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.Utils;

/** 
 * Example input: (7 -> 1 -> 6) + (5 -> 9 -> 2) thats 617+295. 
 * Output: 2 -> 1 -> 9 thats 912
 * @author Danish
 *
 */
public class E2_5_SinglyLinkedListSumList {

	public static void main(String[] args) {
		MySinglyLinkedList ll = new MySinglyLinkedList();
//		ll.populateTestData();
//		ll.deleteNode(10);
		ll.add(new SinglyLinkedListNode(7));
		ll.add(new SinglyLinkedListNode(1));
		ll.add(new SinglyLinkedListNode(6));
		ll.printMyLinkedList();
		
		MySinglyLinkedList ll2 = new MySinglyLinkedList();
		ll2.add(new SinglyLinkedListNode(5));
		ll2.add(new SinglyLinkedListNode(9));
		ll2.add(new SinglyLinkedListNode(2));
		ll2.printMyLinkedList();
		sumList(ll, ll2).printMyLinkedList();
		
	}
	private static MySinglyLinkedList sumList(MySinglyLinkedList sum1, MySinglyLinkedList sum2) {
		Long sum1Long = convertToLong(sum1);
		Long sum2Long = convertToLong(sum2);
		Long totalSum = sum1Long + sum2Long;
		System.out.println("sum of " + sum1Long + " and " + sum2Long + " = " + totalSum);
//		System.out.println("summed values: " + totalSum);
		char [] reverseSumOutput = Utils.reverseStr(totalSum.toString()).toCharArray();
//		System.out.println("Reversed sum: " + Arrays.toString(reverseSumOutput));
		MySinglyLinkedList ll = new MySinglyLinkedList();
		for (int i=0;i<reverseSumOutput.length; i++) {
//			System.out.println("adding: " + Character.getNumericValue(reverseSumOutput[i]));
//			ll.printMyLinkedList();
			ll.add(new SinglyLinkedListNode(Character.getNumericValue(reverseSumOutput[i])));
		}
//		ll.printMyLinkedList();
		return ll;
	}
	private static Long convertToLong(MySinglyLinkedList ll) {
		SinglyLinkedListNode node = ll.getFirstNode();
		if (node==null) {
			return 0l;
		}
		StringBuilder result = new StringBuilder();
		result.append(node.getNodeValue());
		do {
			node=node.getNextNode();
			if (node!=null) {
				result.append(node.getNodeValue());
			}
			
		}while (node!=null);
//		System.out.println(Utils.reverseStr(result.toString()));
		return Long.parseLong(Utils.reverseStr(result.toString()));
	}
	
}

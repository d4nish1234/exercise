package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.MySinglyLinkedList;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedListNode;

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
		sumListBackWards(ll, ll2).printMyLinkedList();
		
		sumListForwards(ll, ll2).printMyLinkedList();
		
	}
	
	private static MySinglyLinkedList sumListForwards(MySinglyLinkedList sum1, MySinglyLinkedList sum2) {
		Long sum1Long = convertToLong(sum1, true);
		Long sum2Long = convertToLong(sum2, true);
		Long totalSum = sum1Long + sum2Long;
		
		return MySinglyLinkedList.toLinkedList(totalSum.toString(), true);
	}
	private static MySinglyLinkedList sumListBackWards(MySinglyLinkedList sum1, MySinglyLinkedList sum2) {
		Long sum1Long = convertToLong(sum1, false);
		Long sum2Long = convertToLong(sum2, false);
		Long totalSum = sum1Long + sum2Long;
		
		return MySinglyLinkedList.toLinkedList(totalSum.toString(), false);
	}
	private static Long convertToLong(MySinglyLinkedList ll, boolean isForward) {
			return Long.parseLong(ll.convertToString(isForward));
	}
	
}

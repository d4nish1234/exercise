package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedList;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SinglyLinkedListNode;

/** 
 * Example input: (7 -> 1 -> 6) + (5 -> 9 -> 2) thats 617+295. 
 * Output: 2 -> 1 -> 9 thats 912
 * @author Danish
 *
 */
public class E2_5_SinglyLinkedListSumList {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
//		ll.populateTestData();
//		ll.deleteNode(10);
		ll.add(new SinglyLinkedListNode(7));
		ll.add(new SinglyLinkedListNode(1));
		ll.add(new SinglyLinkedListNode(6));
		ll.printMyLinkedList();
		
		SinglyLinkedList ll2 = new SinglyLinkedList();
		ll2.add(new SinglyLinkedListNode(5));
		ll2.add(new SinglyLinkedListNode(9));
		ll2.add(new SinglyLinkedListNode(2));
		ll2.printMyLinkedList();
		sumListBackWards(ll, ll2).printMyLinkedList();
		
		sumListForwards(ll, ll2).printMyLinkedList();
		
	}
	
	private static SinglyLinkedList sumListForwards(SinglyLinkedList sum1, SinglyLinkedList sum2) {
		Long sum1Long = convertToLong(sum1, true);
		Long sum2Long = convertToLong(sum2, true);
		Long totalSum = sum1Long + sum2Long;
		
		return SinglyLinkedList.toLinkedList(totalSum.toString(), true);
	}
	private static SinglyLinkedList sumListBackWards(SinglyLinkedList sum1, SinglyLinkedList sum2) {
		Long sum1Long = convertToLong(sum1, false);
		Long sum2Long = convertToLong(sum2, false);
		Long totalSum = sum1Long + sum2Long;
		
		return SinglyLinkedList.toLinkedList(totalSum.toString(), false);
	}
	private static Long convertToLong(SinglyLinkedList ll, boolean isForward) {
			return Long.parseLong(ll.convertToString(isForward));
	}
	
}

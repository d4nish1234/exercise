package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.MySinglyLinkedList;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.Utils;

public class E2_6_SinglyLinkedListIsPalindrone {

	public static void main(String[] args) {
		MySinglyLinkedList ll = new MySinglyLinkedList();
		System.out.println(Utils.isPalindrone("12121"));
		ll.clear();
		ll.addSingleChars("12121");
		System.out.println(isPalindrone(ll));
		
		System.out.println(Utils.isPalindrone("22"));
		ll.clear();
		ll.addSingleChars("22");
		System.out.println(isPalindrone(ll));
		
		System.out.println(Utils.isPalindrone("21"));
		ll.clear();
		ll.addSingleChars("21");
		System.out.println(isPalindrone(ll));
		
		System.out.println(Utils.isPalindrone("2"));
		ll.clear();
		ll.addSingleChars("2");
		System.out.println(isPalindrone(ll));
		
		System.out.println(Utils.isPalindrone(""));
		ll.clear();
		ll.addSingleChars("");
		System.out.println(isPalindrone(ll));
		
//		System.out.println(Utils.isPalindrone("2930/ujr230"));
//		System.out.println(Utils.isPalindrone("abababababa"));
//		System.out.println(Utils.isPalindrone("1"));
//		System.out.println(Utils.isPalindrone("12"));
//		System.out.println(Utils.isPalindrone("121"));
//		System.out.println(Utils.isPalindrone("123456789z987654321"));
	}
	
	private static boolean isPalindrone(MySinglyLinkedList ll) {
		System.out.println(ll.convertToString(true));
		return Utils.isPalindrone(ll.convertToString(true));
	}

}

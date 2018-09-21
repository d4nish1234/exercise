package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

import java.util.Stack;

public class Utils {
	public static String reverseStr(String toReverse) {
		StringBuilder output = new StringBuilder();
		char [] toReverseChar = toReverse.toCharArray();
		for (int i=toReverseChar.length-1; i>=0; i--) {
			output.append(toReverseChar[i]);
		}
		return output.toString();
	}
	public static boolean isPalindrone(String input) {
		System.out.print("String received: " + input + " --> ");
		char [] inputChar = input.toCharArray();
		boolean isInputOdd = (input.length() % 2 == 0) ? false : true;
//		System.out.println("odd? " + isInputOdd);
		Stack<Character> stack = new Stack<Character>();
//		System.out.println("pushed: ");
		for (int i=0;i<inputChar.length/2;i++) {
			stack.push(inputChar[i]);
//			System.out.print(inputChar[i] + " ");
		}
//		System.out.println("");
		int i;
		if (isInputOdd) {
			i=(inputChar.length/2) +1;
		}else {
			i=(inputChar.length/2);
		}
		
//		System.out.println("popped: ");
		for (;i<inputChar.length;i++) {
			char c = stack.pop();
//			System.out.print(c + " ");
			if (c!=inputChar[i]) {
				return false;
			}
		}
		return true;
	}
}

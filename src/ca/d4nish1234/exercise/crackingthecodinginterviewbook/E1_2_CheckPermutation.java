package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.Arrays;

class E1_2_CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPermutation("abc  ", " bc a"));
	}
	static boolean checkPermutation(String s1, String s2) {
		if (s1.length()!=s2.length()) {
			System.out.println("length not same");
			return false;
		}
		// case sensitive? yes
		// whitespace considered? yes
		char [] stChar1 = s1.toCharArray();
		char [] stChar2 = s2.toCharArray();
		System.out.println("before sort");
		System.out.println(stChar1);
		System.out.println(stChar2);
		Arrays.sort(stChar1);
		Arrays.sort(stChar2);
		System.out.println("after sort");
		System.out.println(stChar1);
		System.out.println(stChar2);
		System.out.println("are they equal?");
		return Arrays.equals(stChar1,stChar2);
		
	}
	boolean checkPermutation2(String s1, String s2) {
		if (s1.length()!=s2.length()) {
			System.out.println("length not same");
			return false;
		}
		// case sensitive? yes
		// whitespace considered? yes
		char [] stChar1 = s1.toCharArray();
		char [] stChar2 = s2.toCharArray();
		return false;
	}
}

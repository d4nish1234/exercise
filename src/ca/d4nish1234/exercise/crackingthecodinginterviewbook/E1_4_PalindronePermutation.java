package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E1_4_PalindronePermutation {

	public static void main(String[] args) {
		System.out.println(findPalindronePermutation("Tact coa"));
		
	}
	static boolean findPalindronePermutation(String input) {
		input=input.toLowerCase().replace(" ", ""); // lowercase + remove spaces
		Map<Character,Integer> palindroneMap = new HashMap<Character,Integer>();
		// iterate through the palindroneMap and get character count
		for (char c:input.toCharArray()) {
			if (palindroneMap.get(c)==null) {
				palindroneMap.put(c, 1);
			}else {
				palindroneMap.put(c, palindroneMap.get(c) +1);
			}
		}
		boolean odd = false;
		
		// Ensure all character count in palindrone is even. One odd is allowed in the middle
		for (Entry<Character, Integer> m: palindroneMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			if (m.getValue()%2 != 0) {
				// if odd
				if (odd==true) {
					return false;
				}else {
					odd=true;
				}
			}
		}
		return true;
	}
}

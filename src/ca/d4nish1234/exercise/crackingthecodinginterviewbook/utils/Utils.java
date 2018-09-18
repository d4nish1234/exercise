package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class Utils {
	public static String reverseStr(String toReverse) {
		StringBuilder output = new StringBuilder();
		char [] toReverseChar = toReverse.toCharArray();
		for (int i=toReverseChar.length-1; i>=0; i--) {
			output.append(toReverseChar[i]);
		}
		return output.toString();
	}
}

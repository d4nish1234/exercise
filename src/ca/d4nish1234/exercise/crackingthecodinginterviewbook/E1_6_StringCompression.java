package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1_6_StringCompression {

	public static void main(String[] args) {
		System.out.println(stringCompression("abc"));
		System.out.println(stringCompression("aabbcc"));
		System.out.println(stringCompression("aaaaaabcccc"));
		System.out.println(stringCompression("abbbbbbbc"));
		System.out.println(stringCompression(""));
		System.out.println(stringCompression("AbC"));
		System.out.println(stringCompression("abc23425234"));
	}
	static String stringCompression(String input) {
		System.out.print(input + "-> ");
		Pattern p = Pattern.compile("^[a-zA-Z]*");
		Matcher m = p.matcher(input);
		if (!m.matches()) {
//			System.out.print("illegal characters were sent returning input-> ");
			return input;
		}
		if (input.length()==0){
			return input;
		}
		char [] strChar = input.toCharArray();
		int count =1;
		char prevChar=strChar[0];
		StringBuilder compressedOutput = new StringBuilder();
		compressedOutput.append(prevChar);
		for (int i=1;i<strChar.length;i++) {
			if (prevChar == strChar[i]) {
				count++;
			}else {
				if (count>1) {
					compressedOutput.append(count);
				}
				count=1;
				prevChar=strChar[i];
				compressedOutput.append(strChar[i]);
			}
		}
		if (count>1) {
			compressedOutput.append(count);
		}
		return compressedOutput.toString();
	}
}

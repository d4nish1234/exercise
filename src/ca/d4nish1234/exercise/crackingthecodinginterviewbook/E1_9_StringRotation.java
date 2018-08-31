package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

public class E1_9_StringRotation {

	public static void main(String[] args) {
		System.out.println(stringRotation("waterbottle","erbottlewat")); // true
		System.out.println(stringRotation("110011","001100")); // false
		System.out.println(stringRotation("dontknowi","idontknow")); // true
	}
	static boolean stringRotation(String s1, String s2) {
		String wrappedString1 = s1 + s1;
		if (isSubstring(s2, wrappedString1)) {
			return true;
		}
		return false;
	}
	
	static boolean isSubstring(String a,String b) {
		return b.contains(a);
	}
}

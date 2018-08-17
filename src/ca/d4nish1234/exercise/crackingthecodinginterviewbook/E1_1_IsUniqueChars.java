package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

public class E1_1_IsUniqueChars {

	public static void main(String[] args) {
		System.out.println(isUniqueChars(new char [] {'a','b'}));
		System.out.println(isUniqueChars(new char [] {'a','b','C','c','B'}));
		System.out.println(isUniqueChars(new char [] {'a','b','C','c','B','a'}));
	}
	
	static boolean isUniqueChars(char [] charList) {
		System.out.print("is char list unique: ");
		System.out.println(charList);
		boolean [] boolList = new boolean [128]; // z has the highest char int value of 122
		for (char c : charList) {
			if (boolList[c] == false ) {
				boolList[c] = true;
			} else {
				return false;
			}
		}
		return true;
	}
}

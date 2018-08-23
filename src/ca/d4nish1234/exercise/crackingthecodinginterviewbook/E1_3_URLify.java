package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

public class E1_3_URLify {

	public static void main(String[] args) {
		System.out.println(URLify("this is a url.php   ",17));
		System.out.println(URLify2("this is a url.php",17));
	}
	// first implementation -> use strings but this is not efficient
	static String URLify(String inputURL, int trueLength) {
		return inputURL.substring(0, trueLength).replaceAll(" ", "%20");
	}
	
	// second implementation we can use String builder..basically replace above method with a string builder
	
	// third implementation to use char list and build as you go - not requiring a temporary buffer
	static char [] URLify2(String inputURL, int trueLength) {
		char [] inputURLChar = inputURL.toCharArray();
		int noOfSpaces = 0;
		for (int count=0;count<trueLength;count++) {
			if (" ".equals(inputURL.substring(count,count+1))) {
				noOfSpaces++;
			}
		}
		System.out.println("debug: noOfSpaces= " + noOfSpaces);
		int endOutputCharListIndex= trueLength + (noOfSpaces *2);
		char [] outputURLChar = new char [endOutputCharListIndex+1];
		
		
		for (int i = trueLength-1; i>=0; i--) {
			if (inputURLChar[i] == ' ') {
				outputURLChar[endOutputCharListIndex--] ='0' ;
				outputURLChar[endOutputCharListIndex--] ='2' ;
				outputURLChar[endOutputCharListIndex--] ='%' ;
			}else {
				outputURLChar[endOutputCharListIndex--] =inputURLChar[i];
			}
//			System.out.print("debug - i : " + i + ". outputURLChar = " );System.out.println(outputURLChar);

		}
		System.out.print("out: ");
		System.out.println(outputURLChar);
		return outputURLChar;
	}

}

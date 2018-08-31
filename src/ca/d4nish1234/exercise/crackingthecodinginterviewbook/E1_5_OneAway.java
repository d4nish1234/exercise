package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

public class E1_5_OneAway {
	public static void main (String [] args) {
		System.out.println("abc, abc -> " +oneAway("abc","abc")); // expect true
		System.out.println("pale, ple -> " +oneAway("pale","ple")); // expect true
		System.out.println("pales, pale -> " +oneAway("pales","pale")); // expect true
		System.out.println("pale, bale -> " +oneAway("pale","bale")); // expect true
		System.out.println("pale, bake -> " +oneAway("pale","bake")); // expect false
		System.out.println("pale, pblt -> " +oneAway("pale","pblt")); // expect false
		System.out.println("pal, bakes -> " +oneAway("pal","bakes")); // expect false
	}
	static boolean oneAway(String str1, String str2) {
		if (Math.abs(str1.length() - str2.length()) >1) {
//			System.out.print("two or more changes found via length comparison");
			return false;
		}
		if (str1.length()>str2.length()) {
			return _oneAway(str1,str2);
		}else {
			return _oneAway(str2,str1);
		}
	}
	static boolean _oneAway(String str1, String str2) {
		//System.out.println("found: " + str1 + ", " + str2);
		char [] strChar1 = str1.toCharArray();
		char [] strChar2 = str2.toCharArray();
		
		int awayCount =0;
		/* three types of operations for one off:
		1 - delete (removal of a char)
		2 - modify (to a different char)
		3 - addition of a new character
		*/
		
		int aoffset = 0;
		int boffset = 0;
		for (int i=0;i<strChar1.length-1;i++) {
			if (strChar1[i+aoffset]!=strChar2[i+ boffset]) {
				//System.out.println(strChar1[i+aoffset] + " was not equal to " + strChar2[i+ boffset]);
				// was anything modified? compare next character
				if (strChar1[i+1]== strChar2[i+1]) {
					//System.out.println(strChar1[i+1] + " equals " + strChar2[i+1]);
					if (awayCount>1) {
						//System.out.println("found two aways");
						return false;
					}else {
						//System.out.println(" a offset and b offset +1 ");
					aoffset=1;
					boffset=1;
					awayCount++;
					}
				}
				// was anythign added to list 1 /deleted from list 2?
				else if (strChar1[i+1]== strChar2[i]) {
					//System.out.println(strChar1[i+1] +" equals "+ strChar2[i]);
					if (awayCount>1) {
						//System.out.println("found two aways");
						return false;
					}else {
						//System.out.println("a offset +1 ");
						aoffset=1;
						awayCount++; 
					}
				}else {
					return false; // too many incorrect characters and our cases did not match
				}
			}
		}
		return true;
	}
}

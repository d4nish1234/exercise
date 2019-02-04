package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.ArrayList;

public class E8_1_TripleStep {

	public static void main(String[] args) {
		System.out.println(tripleStep(1));
		System.out.println(tripleStep(2));
		System.out.println(tripleStep(3));
		System.out.println(tripleStep(4));
		
		System.out.println(tripleStep(35)); //1132436852
//		System.out.println(tripleStep(1000));
	}
	private static int tripleStep(int step) {
		int[] stepCache = new int[step +1];
		return tripleStep_(step, stepCache);
	}
	
	private static int tripleStep_(int step, int[] stepCache) {
		switch(step) {
		case (1): return 1;
		case (2): return 2;
		case (3): return 4;
		}
		if (stepCache[step] == 0) {
			stepCache[step] = tripleStep_(step-1 ,stepCache) + tripleStep_(step-2 ,stepCache) + tripleStep_(step-3 ,stepCache);
//			System.out.println("did not find: " + step);
		}
		return stepCache[step];
	}
}

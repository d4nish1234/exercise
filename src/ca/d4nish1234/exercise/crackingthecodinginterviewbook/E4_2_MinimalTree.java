package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.ArrayList;
import java.util.Arrays;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.BinaryTreeNode;

public class E4_2_MinimalTree {

	public static void main(String[] args) {
//		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1));
		System.out.println("list Data: " + intList +". Length: " + intList.size());
		System.out.println(minimalTree(intList));
	}
	static BinaryTreeNode<Integer> minimalTree(ArrayList<Integer> intList) {
//		BinaryTreeNode<Integer> result = new BinaryTreeNode<Integer>();
		return minimalTree(intList, 0,intList.size()-1);
	}
	
	private static BinaryTreeNode<Integer> minimalTree(ArrayList<Integer> intList, int start, int end) {
		System.out.print(" start: " + start + " end: " + end);
		if (end<start) {
			System.out.println();
			return null;
		}
		int midPoint = (start+end)/2;
		System.out.println(" midPoint: " + midPoint);
		BinaryTreeNode<Integer> result = new BinaryTreeNode<Integer>(intList.get(midPoint));
		result.setLeftNode(minimalTree(intList, start, midPoint-1));
		result.setRightNode(minimalTree(intList, midPoint+1,end));
		return result;
	}
}

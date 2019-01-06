package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.ArrayList;
import java.util.LinkedList;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.BinaryTreeNode;

public class E4_3_ListOfDepths {

	public static void main(String[] args) {
		ArrayList<LinkedList<BinaryTreeNode<Integer>>> result2 = listOfDepths(BinaryTreeNode.populateTestDataInt());
		System.out.println(result2);
		

	}
	static ArrayList<LinkedList<BinaryTreeNode<Integer>>> listOfDepths(BinaryTreeNode<Integer> root) {
		
		ArrayList<LinkedList<BinaryTreeNode<Integer>>> result = new ArrayList<LinkedList<BinaryTreeNode<Integer>>>();
		LinkedList<BinaryTreeNode<Integer>> current = new LinkedList<BinaryTreeNode<Integer>>();
		
		if (root !=null) {
			current.add(root);
		}
		while (current.size()>0) {
			result.add(current);
			
			// go to next level
			LinkedList<BinaryTreeNode<Integer>> parents = current;
			current = new LinkedList<BinaryTreeNode<Integer>>(); 
			for (BinaryTreeNode<Integer> parent: parents) {
				
				if (parent.getLeftNode()!=null) {
					current.add(parent.getLeftNode());
				}
				
				if (parent.getRightNode()!=null) {
					current.add(parent.getRightNode());
				}
			}
		}
		
		return result;
	}
	
//	static void printBinaryTreeNodeListInt(ArrayList<LinkedList<BinaryTreeNode<Integer>>> lists) {
//		for (LinkedList<BinaryTreeNode<Intger>> list: lists) {
//			System.out.println();
//		}
//	}
}

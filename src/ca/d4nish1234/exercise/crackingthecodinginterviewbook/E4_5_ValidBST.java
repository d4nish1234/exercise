package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.BinaryTreeNode;

public class E4_5_ValidBST {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> treeNodeRoot = BinaryTreeNode.populateBSTTestDataInt();
		System.out.println(isValidBST(treeNodeRoot));
		System.out.println(treeNodeRoot);
	}
	static boolean isValidBST(BinaryTreeNode<Integer> root) {
		if (root==null) return true;
		
		if (root.getLeftNode()!=null) {
			if (root.getLeftNode().getValue()>root.getValue()) {
				return false;
			}
			if (!isValidBST(root.getLeftNode())) {
				return false;
			};
		}
		
		if (root.getRightNode()!=null) { 
				if (root.getRightNode().getValue()<root.getValue()) {
					return false;
				}
				if (!isValidBST(root.getRightNode())) {
					return false;
				}
		}
		return true;
	}
}

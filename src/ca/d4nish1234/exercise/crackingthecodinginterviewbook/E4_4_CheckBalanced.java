package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.BinaryTreeNode;

public class E4_4_CheckBalanced {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> treeNodeRoot = BinaryTreeNode.populateTestDataInt();
		System.out.println(checkBalanced(treeNodeRoot));
		System.out.println(treeNodeRoot);
	}
	static boolean checkBalanced(BinaryTreeNode<Integer> root) {
		if (root==null) return false;
		
		if (Math.abs(getBinaryTreeHeight(root.getLeftNode()) - getBinaryTreeHeight(root.getRightNode())) >1) {
			return false;
		}else {
			return true;
		}
		
	}
	static int getBinaryTreeHeight(BinaryTreeNode<Integer> root) {
		if (root==null) return -1; // the height of a null node should be subtracted from the overall result
		
		return getBinaryTreeHeight(root.getLeftNode()) + getBinaryTreeHeight(root.getRightNode());
	}
}

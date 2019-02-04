package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.BinaryTreeNode;

public class E4_Extra_ConvertBSTtoArray {
	int [] result;
	int index =0;
	public static void main(String[] args) {
		E4_Extra_ConvertBSTtoArray c = new E4_Extra_ConvertBSTtoArray();
		int [] result = new int[7];
		c.toArray(BinaryTreeNode.populateBSTTestDataInt(), result);
		
		for (int v: result) {
			System.out.print(v  + " ");
		}
		
	}

	public int[] toArray(BinaryTreeNode<Integer> binaryTreeNode, int arr[]) {
		
		if (binaryTreeNode == null) return null;
		
		toArray(binaryTreeNode.getLeftNode(), arr);
		arr[index] = binaryTreeNode.getValue();
		index++;
		
		toArray(binaryTreeNode.getRightNode(), arr);
		
		return arr;
	}
}

package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class BinaryTreeNode<T> {
	private T value;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;

	public BinaryTreeNode(T value){
		super();
		this.value = value;
	}
	public BinaryTreeNode<T> getLeftNode() {
		return this.left;
	}
	public BinaryTreeNode<T> getRightNode() {
		return this.right;
	}

	public void setRightNode(BinaryTreeNode<T> node) {
		this.right= node;
	}
	public void setLeftNode(BinaryTreeNode<T> node) {
		this.left= node;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [value=" + value + ", left=" + left + ", right=" + right + "]";
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public static BinaryTreeNode<Integer> populateTestDataInt(){
		BinaryTreeNode<Integer> t = new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> n1 = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> n2 = new BinaryTreeNode<Integer>(7);
		
		n1.setLeftNode(new BinaryTreeNode<Integer>(2));
		n1.setRightNode(new BinaryTreeNode<Integer>(3));
		
		n2.setLeftNode(new BinaryTreeNode<Integer>(8));
		n2.setRightNode(new BinaryTreeNode<Integer>(9));
		
		t.setLeftNode(n1);
		t.setRightNode(n2);
		/**
		 *        1
		 *     4     7
		 *    2 3   8 9
		 */
		return t;
	}
	
	public static BinaryTreeNode<Integer> populateBSTTestDataInt(){
		BinaryTreeNode<Integer> t = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> n1 = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> n2 = new BinaryTreeNode<Integer>(6);
		
		n1.setLeftNode(new BinaryTreeNode<Integer>(1));
		n1.setRightNode(new BinaryTreeNode<Integer>(3));
		
		n2.setLeftNode(new BinaryTreeNode<Integer>(5));
		n2.setRightNode(new BinaryTreeNode<Integer>(7));
		
		t.setLeftNode(n1);
		t.setRightNode(n2);
		/**
		 *        4
		 *     2     6
		 *    1 3   5 7
		 */
		return t;
	}
	
}

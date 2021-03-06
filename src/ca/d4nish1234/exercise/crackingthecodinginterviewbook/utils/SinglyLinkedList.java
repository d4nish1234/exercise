package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

import java.util.ArrayList;

public class SinglyLinkedList{
	//unsorted linked list
	private SinglyLinkedListNode n;
	public SinglyLinkedListNode getFirstNode() {
		return n;
	}
	public void setFirstNode(SinglyLinkedListNode first) {
		this.n= first;
	}
	public void addSingleChars(String toAdd) {
		for (char c: toAdd.toCharArray()) {
			this.add(new SinglyLinkedListNode(Character.getNumericValue(c)));
		}
	}
	public void empty() {
		this.setFirstNode(null);
	}
	public void clear() {
		this.setFirstNode(null);
	}
	public static SinglyLinkedList toLinkedList(String value, boolean isForward) {
//		System.out.println("sum of " + sum1Long + " and " + sum2Long + " = " + totalSum);
//		System.out.println("summed values: " + totalSum);
		char [] reverseSumOutput;
		if (isForward) {
			reverseSumOutput = value.toCharArray();
		}else {
			reverseSumOutput = Utils.reverseStr(value).toCharArray();
		}
//		System.out.println("Reversed sum: " + Arrays.toString(reverseSumOutput));
		SinglyLinkedList ll = new SinglyLinkedList();
		for (int i=0;i<reverseSumOutput.length; i++) {
//			System.out.println("adding: " + Character.getNumericValue(reverseSumOutput[i]));
//			ll.printMyLinkedList();
			ll.add(new SinglyLinkedListNode(Character.getNumericValue(reverseSumOutput[i])));
		}
//		ll.printMyLinkedList();
		return ll;
	}
	public String convertToString(boolean isForward) {
		SinglyLinkedListNode node = this.getFirstNode();
		if (node==null) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		result.append(node.getNodeValue());
		do {
			node=node.getNextNode();
			if (node!=null) {
				result.append(node.getNodeValue());
			}
			
		}while (node!=null);
//		System.out.println(Utils.reverseStr(result.toString()));
		if (isForward) {
			return result.toString();
		}else {
			return Utils.reverseStr(result.toString());
		}
	}
	
	public boolean partition(int partition) {
		SinglyLinkedList lower = new SinglyLinkedList();
		SinglyLinkedList upper = new SinglyLinkedList();
		
		SinglyLinkedListNode node = this.getFirstNode();
		
		
		// if empty dont do anything
		if (node ==null)
			return false;
		
		boolean isFirst=true;
		// make two linked lists : one for upper one for lower
		do {
			if (node.getNextNode()!=null) {
				if (node.getNodeValue()< partition) {
					lower.add(new SinglyLinkedListNode(node.getNodeValue()));
				}else {
					upper.add(new SinglyLinkedListNode(node.getNodeValue()));
				}
			}
			if (isFirst) {
				isFirst=false;
			}else {
				node = node.getNextNode();
			}
				
		}while(node != null);
		
//		lower.printMyLinkedList();
//		upper.printMyLinkedList();
		
		node = lower.getFirstNode();
		
		if (node == null) {
			this.setFirstNode(upper.getFirstNode());
			return true;
		}
		
		
		while (node.getNextNode()!=null) {
			node = node.getNextNode();
		}
		node.setNextNode(upper.getFirstNode());
		this.setFirstNode(lower.getFirstNode());
		return true;
	}
	public boolean deleteNode(int position) {
		if (position <1 ) return false;
		
		if (position == 1) {
			if (this.getFirstNode()!=null) {
				this.setFirstNode(this.getFirstNode().getNextNode());
				return true;
			}else {
				return false;
			}
		}
		
		SinglyLinkedListNode n = this.getFirstNode();
		for (int i=2; i<position;i++) {
			if (n==null || n.getNextNode()==null) {
				return false;
			}
			n=n.getNextNode();
		}
		if (n.getNextNode()!=null) {
			n.setNextNode(n.getNextNode().getNextNode());
			return true;
		}else {
			return false;
		}
	}
	
	public int length() {
		SinglyLinkedListNode node = this.getFirstNode();
		if (node ==null) {
			return 0;
		}
		int count=1;
		
		while (node.getNextNode() !=null) {
			node=node.getNextNode();
			count++;
		}
		return count;
	}
	
	public void returnKthToLast(int k) {
		for (int i =1;i<=k-1;i++) {
			this.setFirstNode(this.getFirstNode().getNextNode());
		}
	}
	public void add(SinglyLinkedListNode newNode){
//		System.out.println("adding..." + newNode.getNodeValue());
		if (n==null) {
			// first node
			n=newNode;
		}else {
			// nth node
			SinglyLinkedListNode temp = this.n;
			while (temp.getNextNode() !=null) {
					temp = temp.getNextNode();		
			}
			temp.setNextNode(newNode);
		}
	}
	public void removeDuplicates() {
		ArrayList<Integer> tempValues = new ArrayList<Integer>();
		SinglyLinkedListNode temp = this.n;
		if (temp==null) {
			return;
		}else {
			// add first node value to array List
			tempValues.add(temp.getNodeValue());
			
			do {
				if (tempValues.contains(temp.getNextNode().getNodeValue())) {
//						System.out.println("found duplicate !" + temp.getNextNode().getNodeValue());
					temp.setNextNode(temp.getNextNode().getNextNode());
					continue;
				}else {
					tempValues.add(temp.getNodeValue());
				}
				temp=temp.getNextNode();
			} while (temp!=null && temp.getNextNode()!=null);
		}
	}
	public void printMyLinkedList() {
		System.out.print("printing... ");
		SinglyLinkedListNode node = this.n;
		if (node==null) {
		}else {
			do {
				System.out.print(node.getNodeValue() + " -> ");
				node = node.getNextNode();
			}while (node!=null);
		}
		System.out.println("end");
		
	}
	public void populateTestData() {
		this.add(new SinglyLinkedListNode(1));
		this.add(new SinglyLinkedListNode(2));
		this.add(new SinglyLinkedListNode(3));
		this.add(new SinglyLinkedListNode(4));
		this.add(new SinglyLinkedListNode(5));
		this.add(new SinglyLinkedListNode(6));
		this.add(new SinglyLinkedListNode(7));
		this.add(new SinglyLinkedListNode(8));
		this.add(new SinglyLinkedListNode(9));
		this.add(new SinglyLinkedListNode(10));
	}
}

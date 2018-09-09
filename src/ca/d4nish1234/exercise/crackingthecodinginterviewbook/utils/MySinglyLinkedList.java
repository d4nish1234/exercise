package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

import java.util.ArrayList;

public class MySinglyLinkedList{
	//unsorted linked list
	private SinglyLinkedListNode n;
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
			// first node
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
}

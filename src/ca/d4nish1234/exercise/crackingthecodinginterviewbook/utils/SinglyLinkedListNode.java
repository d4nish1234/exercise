package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class SinglyLinkedListNode{
	private int value;
	private SinglyLinkedListNode next;
	public SinglyLinkedListNode (int value){
		super();
		this.value = value;
	}
	public SinglyLinkedListNode(){
		super();
		this.value=0;
	}
	public int getNodeValue() {
		return value;
	}
	public void setNodeValue(int value) {
		this.value = value;
	}
	public SinglyLinkedListNode getNextNode() {
		return next;
	}
	public void setNextNode(SinglyLinkedListNode node) {
		this.next =node;
	}
}
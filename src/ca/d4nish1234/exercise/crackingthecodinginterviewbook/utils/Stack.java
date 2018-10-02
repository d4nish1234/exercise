package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class Stack<T> {
	private StackNode<T> top;
	
	public void push(T t) {
		StackNode<T> node = new StackNode<T>(t);
		node.setNext(top);
		top=node;
		
	}
	public void pop() throws StackEmptyException{
		if (top==null) {
			throw new StackEmptyException();
		}
		top=top.getNext();
	}
	public void print() {
		StackNode<T> temp = new StackNode<T>();
		temp=top;
		while (temp!=null) {
			System.out.println(temp.getData());
			temp=temp.getNext();
		};
			
	}
}

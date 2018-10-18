package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class Stack<T> {
	private StackNode<T> top;
	
	public void sort() {
//		Stack<T> temp = new Stack<T>();
//		if (this.isEmpty()) {
//			return;
//		}
	}
	public void push(T t) {
		StackNode<T> node = new StackNode<T>(t);
		node.setNext(top);
		top=node;
		
	}
	public boolean isEmpty() {
		return (top==null);
	}
	public T peek(){
		return top.getData();
	}
	public void clear () {
		top=null;
	}
	public T pop() throws StackEmptyException{
		if (top==null) {
			throw new StackEmptyException();
		}
		T temp = top.getData();
		top=top.getNext();
		return temp;
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

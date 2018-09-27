package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class MyStack<T> {
	private StackNode<T> top;
	
	public void push(T t) {
		StackNode<T> node = new StackNode<T>(t);
		node.setNext(top);
		top=node;
		
	}
	public void pop() {
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
	
	private  class StackNode<T>{
		private T data;
		StackNode<T> next;
		
		StackNode(){
		}
		
		StackNode(T t){
			this.data = t;
		}
		public StackNode<T> getNext() {
			return next;
		}
		public void setNext(StackNode<T> next) {
			this.next = next;
		}
		public void setData(T t) {
			this.data =t;
		}
		public T getData() {
			return data;
		}
		
	}
}

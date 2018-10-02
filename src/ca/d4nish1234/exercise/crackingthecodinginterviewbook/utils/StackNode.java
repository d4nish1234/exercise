package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class StackNode<T>{
	private T data;
	StackNode<T> next;
	
	StackNode(){
	}
	
	public StackNode(T t){
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
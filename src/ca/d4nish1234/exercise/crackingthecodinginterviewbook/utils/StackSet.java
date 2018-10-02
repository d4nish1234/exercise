package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class StackSet<T>{
	private int currentSize =0;
	private int MAX_SIZE;
	private Stack<T> stack = new Stack<T>();
	public StackSet(int maxSize) {
		this.MAX_SIZE = maxSize;
	}

	public boolean push(T t) throws StackSetFullException {
		if (!isFull()) {
			stack.push(t);
			currentSize++;
		}else {
			throw new StackSetFullException();
		}
//		System.out.println("current size is :" + currentSize + ".");
//		System.out.println("isful?" + isFull());
		return (isFull());
	}
	public boolean pop() throws StackEmptyException{
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		stack.pop();
		currentSize--;
		return isEmpty();
	}
	public void print() {
		stack.print();
	}
	public boolean isEmpty() {
		return currentSize==0;
	}
	public boolean isFull() {
		return currentSize>=MAX_SIZE;
	}
	
}

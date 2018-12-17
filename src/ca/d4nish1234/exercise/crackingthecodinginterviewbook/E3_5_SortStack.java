package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.Stack;

public class E3_5_SortStack {
// can only use these operations: push , pop, peek, isEmpty()
	
	public static void main (String [] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(1);
		myStack.push(3);
		myStack.push(-3);
		myStack.push(2);
		myStack.push(0);
		myStack.push(10);
		myStack.push(1);
		myStack.push(4);
		myStack.push(3);
		myStack.print();
		System.out.println("about to sort...");
		myStack = Stack.sort(myStack);
		myStack.print();
	}
	
}

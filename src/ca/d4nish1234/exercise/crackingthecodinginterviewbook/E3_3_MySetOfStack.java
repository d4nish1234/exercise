package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.SetOfStacks;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.StackEmptyException;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.StackSetFullException;

public class E3_3_MySetOfStack {

	public static void main(String[] args) throws StackEmptyException, StackSetFullException {
		SetOfStacks<Integer> stack = new SetOfStacks<>();
		System.out.println("max Size: " + SetOfStacks.getMaxSetSize());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
		stack.pop();
		stack.print();
	}
}





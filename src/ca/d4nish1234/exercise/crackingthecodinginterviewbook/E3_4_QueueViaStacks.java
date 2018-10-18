package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.QueueViaStackImpl;
import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.StackEmptyException;

public class E3_4_QueueViaStacks {

	public static void main(String[] args) throws StackEmptyException {
		QueueViaStackImpl<Integer> queueViaStack= new QueueViaStackImpl<Integer>();
		queueViaStack.add(1);
		queueViaStack.add(2);
		queueViaStack.add(3);
		queueViaStack.add(4);                         
		queueViaStack.print();
		queueViaStack.remove();
		
		queueViaStack.print();
		queueViaStack.remove();
		queueViaStack.remove();
		queueViaStack.print();
		queueViaStack.remove();
		queueViaStack.print();
	}
	
}


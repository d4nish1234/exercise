package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

import java.util.ArrayList;
import java.util.List;

public class SetOfStacks<T> {
	List<StackSet<T>> stackSets = new ArrayList<StackSet<T>>();
	private boolean isCurrentStackSetFull;
	private static final int MAX_SET_SIZE = 2;
	
	public void print() {
		for (StackSet<T> s: stackSets) {
			System.out.println("-- new stack --");
			s.print();
		}
	}
	
	public void pop() throws StackEmptyException {
//		System.out.println("about to pop");
		if (stackSets.isEmpty()) {
			throw new StackEmptyException();
		}
		assert (!stackSets.isEmpty());
		StackSet<T> aStackSet = getLatestStackSet();
		if (aStackSet.pop()) {
			// if empty remove last element from stackSets
			stackSets.remove(stackSets.size()-1);
			isCurrentStackSetFull=true;
		}
	}
	
	public void push (T t) throws StackSetFullException {
//		System.out.println("about to push" + t.toString());
		// making sure that if there is no stack set we instantiate one
		if (stackSets.isEmpty()) {
			stackSets.add(new StackSet<T>(MAX_SET_SIZE));
			isCurrentStackSetFull=false;
		}
		if (isCurrentStackSetFull) {
			stackSets.add(new StackSet<T>(MAX_SET_SIZE));
			isCurrentStackSetFull=false;
		}
		
		// at this point there is a new stackSet available to push the stack in
		assert(!stackSets.isEmpty());
		StackSet<T> aStackSet = getLatestStackSet();
		
		if (aStackSet.push(t)) {
			// if full then set isCurrentStackSetFull to true
			isCurrentStackSetFull=true;
		};
		
	}
	public StackSet<T> getLatestStackSet(){
		return stackSets.get(stackSets.size()-1);
	}
	
	/**
	 * How many stack sets are used
	 * @return number of stacks sets used
	 */
	
	public int getStackSetUsedCount() {
		return stackSets.size();
	}

	public static int getMaxSetSize() {
		return MAX_SET_SIZE;
	}
	
}

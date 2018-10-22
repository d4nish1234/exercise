package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class Stack<T> {
	private StackNode<T> top;
	
	public static Stack<Integer> inverseIntStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return stack;
		}
		
		Stack<Integer> tempStack = new Stack<Integer>();
		do {
			try {
				tempStack.push(stack.pop());
			} catch (StackEmptyException e) {
				// this should not happen
				e.printStackTrace();
			}
			
			
		}while (!stack.isEmpty());
		
		return tempStack;
	}
	
	public static Stack<Integer> sort(Stack<Integer> intStack){
		Stack<Integer> tempStack = new Stack<Integer>();
		// if empty return
		if (intStack.isEmpty()) {
			System.out.println("Stack is empty! cannot sort");
			return intStack;
		}
		
		boolean stackSortComplete=false;
		boolean stackSortCorrect = false;
		// start sorting
		
		do {
			do {
				Integer tempNumber;
				try {
					tempNumber = intStack.pop();
				
					if(intStack.peek() != null) {
						if (tempNumber> intStack.peek()) {
							tempNumber = swapIntStack(tempNumber,intStack);
						}
					}
					
					if (tempStack.peek() != null) {
						if (tempNumber< tempStack.peek()) {
							tempNumber = swapIntStack(tempNumber,tempStack);
						}
					}
					tempStack.push(tempNumber);
					
					if (intStack.isEmpty()) {
						stackSortComplete=true;
					}
				} catch (StackEmptyException e) {
					// this should not happen
					e.printStackTrace();
				}
			}while (!stackSortComplete);
			
			intStack=inverseIntStack(tempStack);
			if (isSorted(intStack)){
				stackSortCorrect = true;
//				System.out.println("DEBUG: Sorting is correct!");
			}else {
				stackSortComplete=false;
			}
		}while (!stackSortCorrect);
//		}while (!stackSortComplete);
		
		return intStack;
		
	}
	private static boolean isSorted(Stack<Integer> intStack) {
		if (intStack.isEmpty()) {
			return false;
		}
		StackNode<Integer> stackNode  = intStack.top;
		
		while (stackNode!=null && stackNode.getData()!=null && stackNode.getNext()!=null && stackNode.getNext().getData()!=null) {
//			System.out.println("comparing " + stackNode.getData() + " and " + stackNode.getNext().getData());
				if (stackNode.getData() >stackNode.getNext().getData()) {
					return false;
				}
				stackNode = stackNode.getNext();
		}
		return true;
	}
	private static Integer swapIntStack(Integer intToSwap, Stack<Integer> intStack) throws StackEmptyException {
		Integer temp = intStack.pop();
		intStack.push(intToSwap);
		return temp;
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
		return (top==null)?null:top.getData();
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
		System.out.println(this.toString());
			
	}
	public String toString() {
		StackNode<T> temp = new StackNode<T>();
		temp=top;
		StringBuilder sb = new StringBuilder("[");
		while (temp!=null) {
			sb.append(temp.getData()).append(" ");
			temp=temp.getNext();
		};
		
		return sb.append("]").toString();
	}
}

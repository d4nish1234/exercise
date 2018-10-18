package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

public class QueueViaStackImpl<T>{
	Stack<T> s1 = new Stack<T>();
	Stack<T> s2 = new Stack<T>();
	
	/**
	 * since this is an implementation of a queue the additiona will be done at the beginning of the queue
	 * @param t
	 * @throws StackEmptyException 
	 */
	public void add(T t) throws StackEmptyException {
		if (s1.isEmpty()) {
			s1.push(t);
		}else {
			s2.clear();
			do {
				s2.push(s1.pop());
			}while (!s1.isEmpty());
			
			s1.push(t);
			
			do {
				s1.push(s2.pop());
			}while (!s2.isEmpty());
		}
	}
	/**
	 * since this is a queue the removal will be done at the end
	 * @throws StackEmptyException 
	 */
	public void remove () throws StackEmptyException {
		s1.pop();
	}
	public void print() {
		s1.print();
		System.out.println("---------------");
	}
	
	
}
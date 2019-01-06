package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

import java.util.ArrayList;

public class Node<T> {
	private T value;
	private boolean marked;
	private ArrayList<Node<T>> adjacent;
	
	public Node(T value){
		this.setValue(value);
	}
	public Node(T value, ArrayList<Node<T>> adjacentList){
		this.setValue(value);
		this.setAdjacent(adjacentList);
	}
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	public ArrayList<Node<T>> getAdjacent() {
		return adjacent;
	}
	public void setAdjacent(ArrayList<Node<T>> adjacent) {
		this.adjacent = adjacent;
	}
	
	public void addAdjacent(Node<T> node) {
		if (adjacent==null) {
			adjacent = new ArrayList<Node<T>>();
		}
			adjacent.add(node);
	}
	public boolean isMarked() {
		return marked;
	}
	public void setMarked(boolean marked) {
		this.marked = marked;
	}
	@Override
	public String toString() {
		return "Node [value=" + value + ", marked=" + marked + ", adjacent=" + adjacent + "]";
	}

	
	
}

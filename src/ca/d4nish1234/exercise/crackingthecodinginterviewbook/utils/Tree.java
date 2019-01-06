package ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils;

import java.util.Arrays;

public class Tree<T> {
	private Node<T> [] nodes;

	public Node<T>[] getNodes() {
		return nodes;
	}

	public void setNodes(Node<T>[] nodes) {
		this.nodes = nodes;
	}

	@Override
	public String toString() {
		return "Tree [nodes=" + Arrays.toString(nodes) + "]";
	}
}

package ca.d4nish1234.exercise.crackingthecodinginterviewbook;

import java.util.LinkedList;
import java.util.Queue;

import ca.d4nish1234.exercise.crackingthecodinginterviewbook.utils.Node;

public class E4_1_RouteBetweenNodes {
	public static void main (String [] args) {
		Node<String> nA = new Node<String>("a");
		Node<String> nB = new Node<String>("b");
		Node<String> nC = new Node<String>("c");
		Node<String> nD = new Node<String>("d");
		Node<String> nE = new Node<String>("e");
		Node<String> nF = new Node<String>("f");
		
		/*
		 * b -> d->e < -f
		 * ^    |
		 * |    \/
		 * a ->  c
		 * 
		 */
		// set up Node A
//		ArrayList<Node<String>> adjacentList = new ArrayList<Node<String>>(Arrays.asList(nB,nC));
		nA.addAdjacent(nB);
		nA.addAdjacent(nC);
		
		// set up Node B
//		adjacentList = new ArrayList<Node<String>>(Arrays.asList(nD));
		nB.addAdjacent(nD);
		
		// nothing to set up for Node C and E
		
		// set up Node D
//		adjacentList = new ArrayList<Node<String>>(Arrays.asList(nE,nC));
		nD.addAdjacent(nE);
		nD.addAdjacent(nC);
		
		nF.addAdjacent(nE);
		// expect true
//		System.out.println(breadthFirstSearch(nA, nE));
		
		// expect true
//		System.out.println(breadthFirstSearch(nA, nC));
		
		// expect false
		System.out.println(breadthFirstSearch(nA, nF));
	}
	public static boolean breadthFirstSearch(Node<String> firstNode, Node<String> nodeToFind) {
		
		// TODO: wrap this in a class so that multiple breadthFirstSearch methods can be called.. otherwise marked = true messes up the second method call
		System.out.println("------DEBUG: start ------");
		System.out.println("Final result: " + firstNode.getValue() + " -> " + nodeToFind.getValue());
		Queue<Node<String>> q = new LinkedList<Node<String>>();
		firstNode.setMarked(true);
		q.add(firstNode);
		
		while (!q.isEmpty()) {
			Node<String> head = q.remove();
			// visit head / do logic here: 
			if (nodeToFind.getValue()==head.getValue()) {
				// found the node we were looking for
				System.out.println("------DEBUG: end found------");
				return true;
			}
			
			if (head.getAdjacent() !=null) {
				// add adjacent nodes to the queue
				System.out.println("DEBUG: on head: " + head.getValue());
				for (Node<String> n : head.getAdjacent()) {
					if (n!=null && !n.isMarked()) {
						System.out.println(head.getValue() + " -> " + n.getValue());
						n.setMarked(true);
						q.add(n);
					}
				}
			}else {
				System.out.println("DEBUG: no adjacent found for: " + head.getValue());
			}
			if (q.isEmpty()) {
				System.out.println("------DEBUG: end not found------");
				return false;
			}
		}
		System.out.println("------DEBUG: end not found------");
		return false;
	}
}

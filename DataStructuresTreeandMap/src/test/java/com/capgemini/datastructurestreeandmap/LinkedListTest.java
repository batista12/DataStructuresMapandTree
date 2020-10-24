package com.capgemini.datastructurestreeandmap;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void shouldBeAddedToTop() {
		Node<Integer> myFirstNode = new Node<Integer>(70);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(56);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(myFirstNode);
		LinkedList.add(mySecondNode);
		LinkedList.add(myThirdNode);
		LinkedList.printMyNodes();
		boolean result = LinkedList.head.equals(myThirdNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myFirstNode);
		assertEquals(true, result);
	}

	@Test
	public void shouldBeAppendedToLast() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(myFirstNode);
		LinkedList.add(mySecondNode);
		LinkedList.add(myThirdNode);
		LinkedList.printMyNodes();
		boolean result = LinkedList.head.equals(myThirdNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myFirstNode);
		assertEquals(true, result);
	}

	@Test
	public void given3Numbers_WhenInsertingSecondNumber_ShouldBeAferFirstAndBeforeThird() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(myFirstNode);
		LinkedList.append(myThirdNode);
		LinkedList.insert(myFirstNode, mySecondNode);
		LinkedList.printMyNodes();
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myThirdNode);
		assertEquals(true, result);
	}

	@Test
	public void shouldRemoveFirstNumber() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(myFirstNode);
		LinkedList.append(mySecondNode);
		LinkedList.append(myThirdNode);
		Node<Integer> pop = (Node<Integer>) LinkedList.pop();
		LinkedList.printMyNodes();
		assertEquals(myFirstNode, pop);
	}

	@Test
	public void shouldRemoveLastNumber() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(myFirstNode);
		LinkedList.append(mySecondNode);
		LinkedList.append(myThirdNode);
		Node<Integer> popLast = (Node<Integer>) LinkedList.popLast();
		LinkedList.printMyNodes();
		assertEquals(myThirdNode, popLast);
	}

	@Test
	public void shouldReturnThatNumber() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(myFirstNode);
		LinkedList.append(mySecondNode);
		LinkedList.append(myThirdNode);
		Node<Integer> search = (Node<Integer>) LinkedList.search(30);
		assertEquals(mySecondNode, search);
	}

	@Test
	public void shouldInsertAtCorrectPosition() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(myFirstNode);
		LinkedList.append(mySecondNode);
		LinkedList.append(myThirdNode);
		Node<Integer> myFourthNode = new Node<Integer>(40);
		Node<Integer> searchAndInsert = (Node<Integer>) LinkedList.searchAndInsert(30, myFourthNode);
		LinkedList.printMyNodes();
		assertEquals(mySecondNode, searchAndInsert);
	}

	@Test
	public void shouldPassLinkedListTest() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(40);
		Node<Integer> myFourthNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(myFirstNode);
		LinkedList.append(mySecondNode);
		LinkedList.append(myThirdNode);
		LinkedList.append(myFourthNode);
		Node<Integer> searchAndRemove = (Node<Integer>) LinkedList.searchAndRemove(40);
		System.out.print("Search and Remove. Size = " + LinkedList.size() + " List: ");
		LinkedList.printMyNodes();
		assertEquals(mySecondNode, searchAndRemove);
	}

	@Test
	public void shouldBeAddedInSortedManner() {
		Node<Integer> myFirstNode = new Node<Integer>(70);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(100);
		Node<Integer> myFourthNode = new Node<Integer>(5);
		LinkedList LinkedList = new LinkedList();
		LinkedList.addSortedElement(myFirstNode);
		LinkedList.addSortedElement(mySecondNode);
		LinkedList.addSortedElement(myThirdNode);
		LinkedList.addSortedElement(myFourthNode);
		LinkedList.printMyNodes();
		System.out.print("Sorted Nodes :");
		boolean result = LinkedList.head.equals(myFourthNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.head.getNext().getNext().equals(myFirstNode)
				&& LinkedList.head.getNext().getNext().getNext().equals(myThirdNode);
		assertEquals(true, result);

	}
}
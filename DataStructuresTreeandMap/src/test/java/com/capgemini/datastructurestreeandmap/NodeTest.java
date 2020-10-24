package com.capgemini.datastructurestreeandmap;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void given3NumbersWhenLinked_ShouldPassLinkedListTest() {
		Node<Integer> myFirstNode = new Node<Integer>(56);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertEquals(true, result);
	}
}

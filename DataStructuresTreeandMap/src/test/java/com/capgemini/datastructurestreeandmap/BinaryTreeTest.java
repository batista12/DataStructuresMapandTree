package com.capgemini.datastructurestreeandmap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {

	/**
	 * 
	 */
	@Test
	public void addedToBinaryTree() {
		BinaryTree<Integer> BinaryTree = new BinaryTree<>();
		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(70);
		int size = BinaryTree.getSize();
		assertEquals(3, size);
	}
	@Test
	public void givenNumbersAsInput_WhenAddedToBinaryTree_ShouldReturnSize13() {
		BinaryTree<Integer> BinaryTree = new BinaryTree<>();
		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(70);
		BinaryTree.add(22);
		BinaryTree.add(40);
		BinaryTree.add(60);
		BinaryTree.add(95);
		BinaryTree.add(11);
		BinaryTree.add(65);
		BinaryTree.add(3);
		BinaryTree.add(16);
		BinaryTree.add(63);
		BinaryTree.add(67);
		int size = BinaryTree.getSize();
		assertEquals(13, size);
	}
}
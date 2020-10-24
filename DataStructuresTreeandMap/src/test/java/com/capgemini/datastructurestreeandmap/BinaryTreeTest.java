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
}
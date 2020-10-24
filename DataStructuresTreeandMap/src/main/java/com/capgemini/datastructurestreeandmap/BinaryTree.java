package com.capgemini.datastructurestreeandmap;

/**
 * 
 *
 * @param <K>
 */
public class BinaryTree<K extends Comparable<K>> {
	private BinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRec(root, key);
	}

	/**
	 * @param current
	 * @param key
	 * @return
	 */
	private BinaryNode<K> addRec(BinaryNode<K> current, K key) {
		if (current == null)
			return new BinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRec(current.left, key);
		} else {
			current.right = addRec(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRec(root);
	}

	private int getSizeRec(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRec(current.left) + this.getSizeRec(current.right);
	}
}

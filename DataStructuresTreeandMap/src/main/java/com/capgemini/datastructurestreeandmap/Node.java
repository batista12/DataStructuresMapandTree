package com.capgemini.datastructurestreeandmap;

/**
 * 
 *
 * @param <K>
 */
public class Node<K extends Comparable<K>> implements INode<K> {
	private K key;
	private INode<K> next;
	
	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}
	
	@Override
	public void setNext(INode next) {
		this.next =(Node<K>) next;
	}
	
	/**
	 *
	 */
	public String toString() {
		StringBuilder myString = new StringBuilder();
		myString.append("My Node{"+"key=").append(key).append('}');
		if(next!=null) {
			myString.append("->").append(next);
		}
		return myString.toString();
	}
}

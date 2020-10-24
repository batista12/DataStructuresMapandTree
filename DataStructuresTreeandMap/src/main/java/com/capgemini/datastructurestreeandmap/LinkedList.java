package com.capgemini.datastructurestreeandmap;

public class LinkedList<K> {
	public INode head;
	public INode tail;
	public int size = 0;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
		size++;
	}

	public void append(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		size++;
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!(tempNode.equals(tail)))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		size++;
	}

	public INode pop() {
		if (size > 0) {
			INode tempNode = this.head;
			this.head = head.getNext();
			size--;
			return tempNode;
		} else
			return null;
	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		size--;
		return tempNode;
	}

	public INode search(K key) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			} else
				tempNode = tempNode.getNext();
		}
		return null;
	}

	public INode searchAndInsert(K key, INode newNode) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				break;
			} else
				tempNode = tempNode.getNext();
		}
		INode tempNode2 = tempNode.getNext();
		tempNode.setNext(newNode);
		newNode.setNext(tempNode2);
		size++;
		return tempNode;
	}

	public INode searchAndRemove(K key) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getNext().getKey().equals(key)) {
				break;
			} else
				tempNode = tempNode.getNext();
		}
		tempNode.setNext(tempNode.getNext().getNext());
		size--;
		return tempNode;
	}

	public int size() {
		return size;
	}

	public void addSortedElement(INode newNode) {
		INode tempNode;

		if (head == null || (head.getKey()).compareTo(newNode.getKey()) >= 0) {
			newNode.setNext(head);
			head = newNode;
		} else {
			tempNode = head;
			while (tempNode.getNext() != null && (tempNode.getNext().getKey()).compareTo(newNode.getKey()) < 0) {
				tempNode = tempNode.getNext();
				newNode.setNext(tempNode.getNext());
				tempNode.setNext(newNode);
			}
			size++;
		}

	}
	
	@Override
	public String toString() {
		return "LinkedListNodes{" +head +  '}';
	}
}

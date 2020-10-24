package com.capgemini.datastructurestreeandmap;
public class Map<K extends Comparable<K>, V extends Comparable<V>> {
	LinkedList<K> LinkedList;

	public Map() {
		this.LinkedList = new LinkedList<>();
	}

	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.LinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.LinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.LinkedList.append(myMapNode);
		} else
			myMapNode.setValue(value);
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + LinkedList + '}';
	}
}
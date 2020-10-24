package com.capgemini.datastructurestreeandmap;
import datastructure.linkedlist.INode;

public class MapNode<K extends Comparable<K>, V extends Comparable<V>> implements INode<K> {
	K key;
	V value;
	MapNode<K, V> next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode getNext() {
		return next;
	}

	@Override
	public void setNext(INode next) {
		this.next = (MapNode<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public String toString() {
		StringBuilder MapNodeString = new StringBuilder();
		MapNodeString.append("MapNode:{" + "K= ").append(key).append(" : V= ").append(value).append('}');
		if (next != null)
			MapNodeString.append("->").append(next);
		return MapNodeString.toString();
	}
}
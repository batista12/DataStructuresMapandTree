package com.capgemini.datastructurestreeandmap;
public class Map<K extends Comparable<K>, V extends Comparable<V>> {
	LinkedList<K> LinkedList;

	public Map() {
		this.LinkedList = new LinkedList<>();
	}

	public V get(K key) {
		MapNode<K, V> MapNode = (MapNode<K, V>) this.LinkedList.search(key);
		return (MapNode == null) ? null : MapNode.getValue();
	}

	public void add(K key, V value) {
		MapNode<K, V> MapNode = (MapNode<K, V>) this.LinkedList.search(key);
		if (MapNode == null) {
			MapNode = new MapNode<>(key, value);
			this.LinkedList.append(MapNode);
		} else
			MapNode.setValue(value);
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + LinkedList  + '}';
	}
}
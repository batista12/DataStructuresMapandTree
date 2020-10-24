package com.capgemini.datastructurestreeandmap;

import java.util.ArrayList;

/**
 * 
 *
 * @param <K>
 * @param <V>
 */
public class LinkedHashMap<K extends Comparable<K>, V extends Comparable<V>> {
	private final int numBuckets;
	ArrayList<LinkedList<K>> reqArray;
	
	public LinkedHashMap() {
		this.numBuckets = 10;
		this.reqArray = new ArrayList<>(numBuckets);
		for(int i=0;i<numBuckets;i++) {
			this.reqArray.add(null);
		}
	}
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode%numBuckets;
		System.out.println("Key: "+key+ ". Hashcode: "+hashCode+". Index: "+index);
		return index;
	}
	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> LinkedList = this.reqArray.get(index);
		if(LinkedList==null)
			return null;
		MapNode<K,V> MapNode = (MapNode<K,V>) LinkedList.search(key);
		return (MapNode==null)?null:MapNode.getValue();
	}
	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> LinkedList = this.reqArray.get(index);
		if(LinkedList==null) {
			LinkedList = new LinkedList<>();
			this.reqArray.set(index, LinkedList);
		}
		MapNode<K,V> MapNode = (MapNode<K,V>) LinkedList.search(key);
		if(MapNode == null) {
			MapNode = new MapNode<>(key, value);
			LinkedList.append(MapNode);
		}
		else 
			MapNode.setValue(value);
	}
	
	@Override
	public String toString() {
		return "LinkedHashMap list{" +reqArray + '}';
	}
}

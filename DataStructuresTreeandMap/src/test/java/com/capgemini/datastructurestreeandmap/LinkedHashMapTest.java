package com.capgemini.datastructurestreeandmap;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.Test;

public class LinkedHashMapTest {
	String sentence;
	LinkedHashMap<String, Integer> LinkedHashMap;

	@Test
	public void givenASentence_WhenWordsAddedToList_ShouldReturnParanoidFrequency() {
		String words[] = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = LinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			LinkedHashMap.add(word, value);
		}
		System.out.println(LinkedHashMap);
		int frequency = (int) LinkedHashMap.get("paranoid");
		assertEquals(3, frequency);
	}

	@Test
	public void shouldRemoveThatKey() {
		String words[] = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = LinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			LinkedHashMap.add(word, value);
		}
		MapNode<String, Integer> MapNode = (MapNode<String, Integer>) LinkedHashMap.remove("avoidable");
		System.out.println(LinkedHashMap);
		assertEquals(MapNode.getNext().getKey(), null);
	}
}


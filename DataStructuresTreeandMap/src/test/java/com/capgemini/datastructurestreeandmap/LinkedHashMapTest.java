package com.capgemini.datastructurestreeandmap;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.Test;

public class LinkedHashMapTest {

	@Test
	public void givenASentence_WhenWordsAddedToList_ShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting "
				+ "themselves deliberately into paranoid avoidable situations";
		LinkedHashMap<String, Integer> LinkedHashMap = new LinkedHashMap<>();
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
		int frequency = LinkedHashMap.get("paranoid");
		assertEquals(3, frequency);
	}
}

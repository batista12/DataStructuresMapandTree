package com.capgemini.datastructurestreeandmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 */
public class MapTest 
{
    /**
     * 
     */
   
    	@Test
    	public void returnWordFrequency() {
    		String sentence = "To be or not to be";
    		Map<String, Integer> Map = new Map<String, Integer>();
    		String words[] = sentence.toLowerCase().split(" ");
    		for (String word : words) {
    			Integer value = Map.get(word);
    			if (value == null)
    				value = 1;
    			else
    				value = value + 1;
    			Map.add(word, value);
    		}
    		int frequency = Map.get("to");
    		System.out.println(Map);
    		assertEquals(2, frequency);
    	}
    }


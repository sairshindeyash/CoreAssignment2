package com.yash.assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapAscendingOrderByValue {

	public HashMap<Integer, Integer> sort(HashMap<Integer, Integer> input) {
		HashMap<Integer, Integer> sorted = new HashMap<Integer, Integer>();
		
		
		Set<Integer> keys = input.keySet();
		Integer[] key = new Integer[keys.size()];
		int i = 0;
		for (Iterator<Integer> iterator = keys.iterator(); iterator.hasNext();) {
			Integer next = (Integer) iterator.next();
			key[i] = next;
			i += 1;

		}

		for (int m = 0; m < key.length; m++) {
			for (int n = m + 1; n < key.length; n++) {
				if (input.get(key[m]) > input.get(key[n])) {

					int temp = input.get(key[m]);

					input.put(key[m], input.get(key[n]));

					input.put(key[n], temp);
				}
			}
		}

		
		 return input;
	}

	public static void main(String[] args) {
		HashmapAscendingOrderByValue hashmapAscendingOrderByValue = new HashmapAscendingOrderByValue();
		HashMap<Integer, Integer> input = new HashMap<Integer, Integer>();
		input.put(1, 60);
		input.put(2, 20);
		input.put(3, 30);
		input.put(4, 40);
		input.put(5, 50);
		System.out.println(hashmapAscendingOrderByValue.sort(input));
	}
}

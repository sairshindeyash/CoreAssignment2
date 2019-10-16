package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnagramTest {
	Anagram anagram = new Anagram();

	@Test
	public void shouldReturnTrueIfStringsAreAnagrams() {
		Boolean expected = true;

		assertEquals(expected, anagram.checkStringIsAnagram("peek", "keep"));
	}

	@Test
	public void shouldReturnFalseIfStringsAreNotAnagrams() {
		Boolean expected = false;

		assertEquals(expected, anagram.checkStringIsAnagram("peek1", "keep"));
	}
}

package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterCountTest {

	CharacterCount characterCount = new CharacterCount();
	
	@Test
	public void shouldReturnia2m2y2she3ploWhenInputIsiamyashemployee() {
		String expected="ia2m2y2she3plo";
		assertEquals(expected, characterCount.countCharacters("iamyashemployee"));
	}
}

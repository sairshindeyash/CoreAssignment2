package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecondHighetNumberTest {
	SecondHighetNumber secondHighetNumber = new SecondHighetNumber();

	@Test
	public void shouldReturnSecondHighestNumberForTheGivenArray() {
		Integer expected = 3;
		Integer[] numbers = new Integer[] { 1, 2, 3, 4, 3, 4, 2, 2, 2 };
		assertEquals(expected, secondHighetNumber.findSecondHighestNumberFromArray(numbers));
	}

	@Test(expected = ArrayEmptyException.class)
	public void shouldThrowExceptionWhenEmptyArrayIsPassed() {
		Integer[] numbers = new Integer[7];

		secondHighetNumber.findSecondHighestNumberFromArray(numbers);
	}

}

package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfEvenNumbersTest {

	SumOfEvenNumbers sumOfEvenNumbers=new SumOfEvenNumbers();
	
	@Test
	public void shouldReturnSumOfEvenNumbersFromArray() {
		Integer expected=40;
		Integer[] numbers=new Integer[] {12,3,45,65,8,9,10,4,6};
		assertEquals(expected, sumOfEvenNumbers.calculateSumOfEvenNumbers(numbers));
	}
}

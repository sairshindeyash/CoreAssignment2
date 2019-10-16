package com.yash.assignment2;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfEvenNumbers {

	public Integer calculateSumOfEvenNumbers(Integer[] numbers) {
		
		
		Integer evens = Arrays.stream(numbers).filter((num)->((num%2)==0)).reduce(Integer::sum).get();
		
		return evens;
	}
	/*
	 * public static void main(String[] args) { SumOfEvenNumbers evenNumbers=new
	 * SumOfEvenNumbers(); Integer[] numbers=new Integer[] {12,3,45,65,8,9,10,4,6};
	 * System.out.println(evenNumbers.calculateSumOfEvenNumbers(numbers)); }
	 */
}

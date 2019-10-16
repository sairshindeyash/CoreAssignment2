package com.yash.assignment2;

import java.util.Arrays;
 
public class SecondHighetNumber {

	public Integer findSecondHighestNumberFromArray(Integer[] numbers) {
		System.out.println("array length====" + numbers.length);
		if (numbers[0] == null)
			throw new ArrayEmptyException("PAssed array is empty... ");

		int secondHighestNumber = 0;
		Arrays.sort(numbers);

		int max = 0, j = 1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= max) {
				max = numbers[i];
			}

			while (numbers[j] < max) {
				secondHighestNumber = numbers[j];
				j += 1;

			}
		}

		return secondHighestNumber;
	}

	public static void main(String[] args) { 
		SecondHighetNumber highetNumber =new SecondHighetNumber(); 
//	 Integer[] numbers = new Integer[] { 1, 2, 3, 4,3, 4, 2, 2, 2 };

	Integer[] numbers = new Integer[] { 1, 2, 3, 4, 3, 4, 2, 2, 2, 5, 11, 90, 1,44 ,68};
	System.out.println(highetNumber.findSecondHighestNumberFromArray(numbers));
}

}

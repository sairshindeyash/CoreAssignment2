package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LeaderNumberTest {
 LeaderNumber leaderNumber=new LeaderNumber();
 
 @Test
 public void sholdReturnAllLeaderNumbersFromTheGivenArray() {
	 List<Integer> expected=Arrays.asList(17,5,2);
	 assertEquals(expected, leaderNumber.getLeaderNumbers(new Integer[] {16, 17, 4, 3, 5, 2}));
 }
 
 
}

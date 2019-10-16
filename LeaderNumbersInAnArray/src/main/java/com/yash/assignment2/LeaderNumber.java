package com.yash.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderNumber {

	public List<Integer> getLeaderNumbers(Integer[] asList) {
		List<Integer> leaders = new ArrayList<Integer>();
		int temp = 0;
		for (int i = 0; i < asList.length; i++) {
			int j;
			for (j = i + 1; j < asList.length; j++) {

				if (asList[i] <= asList[j])
					break;

			}
			if (j == asList.length)
				leaders.add(asList[i]);

		}
		return leaders;
	}

	/*
	 * public static void main(String[] args) { LeaderNumber leaderNumber = new
	 * LeaderNumber(); System.out.println(leaderNumber.getLeaderNumbers(new
	 * Integer[] { 16, 17, 4, 3, 5, 2 })); }
	 */
}

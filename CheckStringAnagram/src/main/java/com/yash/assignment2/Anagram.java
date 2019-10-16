package com.yash.assignment2;

import java.util.Arrays;

public class Anagram {

	public Boolean checkStringIsAnagram(String s1,String s2) {
		String res1="",res2="";
		
		char[] letters1=s1.toCharArray();
		char[] letters2=s2.toCharArray();
		
		Arrays.sort(letters1);
		System.out.println(	letters1);
		
		Arrays.sort(letters2);
		System.out.println(letters2);
		
		for (int i = 0; i < letters2.length; i++) {
			res1=res1+letters1[i];
			res2=res2+letters2[i];
		}
		if(res1.equals(res2))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Anagram anagram=new Anagram();
		System.out.println(anagram.checkStringIsAnagram("Motheds In Law1","Hitler Woman"));
	}
	

}

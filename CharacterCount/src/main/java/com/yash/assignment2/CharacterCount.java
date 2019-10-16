package com.yash.assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CharacterCount {

	public String countCharacters(String string) {
		char[] letters = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : letters) {
		    charSet.add(c);
		}
		
		Character[] un=new Character[charSet.size()];
		int j=0;
		for (Iterator iterator = charSet.iterator(); iterator.hasNext();) {
			Character character = (Character) iterator.next();
			un[j++]=character;
		}
		int count=1;
		String str="";
		HashMap<Character, Integer> lettersCount=new HashMap<Character, Integer>();
		for (int i = 0; i < letters.length; i++) {
			if(lettersCount.containsKey(letters[i])) {
				Integer res=lettersCount.get(letters[i]);
				
				res+=1;
				lettersCount.put(letters[i], res);
			}
			else {
				lettersCount.put(letters[i], count);
			}
		}
		
		int i=0;
		for (Iterator iterator = charSet.iterator(); iterator.hasNext();) {
			Character character = (Character) iterator.next();
			
			Integer res = lettersCount.get(un[i]);
			
			
			if(res>1) {
				str=str+un[i]+res;
			}
			else {
				str=str+un[i];
			}
			i=i+1;
		}

//		System.out.println("charSet=="+charSet);
		
		
		return str;
	} 

	/*
	 * public static void main(String[] args) { CharacterCount characterCount=new
	 * CharacterCount();
	 * System.out.println(characterCount.countCharacters("iamyashemployee")); }
	 */
}

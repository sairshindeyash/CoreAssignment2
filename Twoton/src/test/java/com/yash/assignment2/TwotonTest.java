package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwotonTest {
//	Twoton twoton=new Twoton();
	
	@Test
	public void shouldReturn2() {
		Twoton twoton1=Twoton.createInstance();
		Twoton twoton2=Twoton.createInstance();
		Twoton twoton3=Twoton.createInstance();
		Twoton twoton4=Twoton.createInstance();
		
		int hashcode3 = twoton3.hashCode();
		int hashcode4 = twoton4.hashCode();
		assertEquals(hashcode3, hashcode4);
	}
}

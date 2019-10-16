package com.yash.assignment2;

public class Twoton {
	private static Twoton twoton;
	static int count=0;
	
	private Twoton() {
		count++;
	}
	
	public static Twoton createInstance() {
		if(count<3) {
		 twoton= new Twoton();
		}
		return twoton;
		
	}
	
	public static void main(String[] args) {
		Twoton twoton1=Twoton.createInstance();
		Twoton twoton2=Twoton.createInstance();
		Twoton twoton3=Twoton.createInstance();
		Twoton twoton4=Twoton.createInstance();
		Twoton twoton5=Twoton.createInstance();
		
		System.out.println(twoton1.hashCode());
		System.out.println(twoton2.hashCode());
		System.out.println(twoton3.hashCode());
		System.out.println(twoton4.hashCode());
		System.out.println(twoton5.hashCode());
	}

}

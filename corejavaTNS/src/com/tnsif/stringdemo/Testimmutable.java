package com.tnsif.stringdemo;

public class Testimmutable {
	public static void main(String[] args) {
		String s = "harsha";
		System.out.println(s);
		s.concat("vardhan");
		System.out.println(s);
		s= s.concat("vardhan");
		System.out.println(s);	
	}
	
}

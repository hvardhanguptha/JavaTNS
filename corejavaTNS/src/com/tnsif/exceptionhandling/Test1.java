package com.tnsif.exceptionhandling;

public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println("welcome");
		}
		catch(ArithmeticException e) {
			System.out.println("exception occured");
		}
		finally {
			System.out.println("hi, THIS MESSAGE IS ALWAYS PRINTED");
		}
	}

}

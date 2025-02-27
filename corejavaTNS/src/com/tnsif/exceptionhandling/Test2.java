package com.tnsif.exceptionhandling;

public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e) {
			System.out.println("exception occured"+e.getMessage());
		}
		finally {
			System.out.println("hi, THIS MESSAGE IS ALWAYS PRINTED");
		}
	}


}

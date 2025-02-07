package com.tnsif.exceptionhandling;

import java.io.IOException;

public class Checkedexception {
	public static void main(String[] args) {
		int a=5;
		
		try {
			int b= a/2;
			System.out.println(b);
			
		}
		catch(ArithmeticException e) {
			
			System.out.println(a);
			System.out.println("expection catched"+ e);
			
		}
	}

}

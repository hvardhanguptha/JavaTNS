package com.tnsif.exceptionhandling;

import java.io.IOException;

public class Nestedtrycatch {
	public static void check() {
		try {
			try {
				System.out.println("hello");
			}
		}
		catch(ArithmeticException e) {
				System.out.println("hi"+ e.getMessage());
			}
		catch(IOException a) {
			System.out.println("hi");
		}
		
		}
	}


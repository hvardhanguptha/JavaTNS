package com.tnsif.exceptionhandling;

public class Allexceptions {
	public static void divide() {
		int a=1,b=0,c;
		try {
			System.out.println("we are trying to slove divsion problem where this helps us to find an expection if occurs, and gives why that exceprion is caused");
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException d) {
			System.out.println("ARTHEMATICEXCEPTION"+"   "+d.getMessage());
			
		}
		
		
	}

}

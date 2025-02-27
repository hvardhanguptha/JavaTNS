package com.tnsif.exceptionhandling;

import java.io.IOError;
import java.io.IOException;

public class Throwsdemo {
	void m1() {
		System.out.println("hi, i dont have any errors");
	}
	void m2() throws IOException{
		System.out.println("DEVICE ERROR");
	}
	void m3() throws ArithmeticException, ArrayIndexOutOfBoundsException{
		System.out.println("File not found");	
	}
	public void m4(int marks) throws IOError{
		try {
			if(marks<56) {
				throw new ArithmeticException("you FAILED>>>>>!");
			}
			else {
				System.out.println("you PASSED.....!");
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
				
		}


public static void main(String args[]) {
	Throwsdemo d=new Throwsdemo();
	d.m1();
	try {
	d.m2();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	d.m3();
	d.m4(0);
}
}
	



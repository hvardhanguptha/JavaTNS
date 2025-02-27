package com.tnsif.exceptionhandling;

import java.util.Scanner;

public class Throwdemo {
	public void validate(int Age) {
		try {
			if(Age<18) {
				throw new ArithmeticException("you are not eligible to vote");
		}
			else {
				System.out.println("you are eligible to vote");
			}
		}

		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Throwdemo d = new Throwdemo();
		d.validate(19);
	}

}

package com.tnsif.lamdaexpression;

public class Parameterdemo {
	public static void main(String[] args) {
		Cube area =(s)->{return(s*s*s);};
		System.out.println("area of chube is "+area.Calculate(2));
	}

}

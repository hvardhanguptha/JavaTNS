package com.tnsif.abstaractiondemo;

public abstract class Shape {
	protected float area;
	abstract void calarea(); //abstract method(dosen't contain implementation)
	void show() { // concrete method
		System.out.println("area of the "+area);
	}
}

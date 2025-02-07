package com.tnsif.abstaractiondemo;

public class Square extends Shape{
	private float side;
	public Square() {
		side=2.0f; // a constructor is used to create the objects
	}
	Square (float side){
		this.side=side;
	}

	@Override
	void calarea() {
		super.area=side*side;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	public static void main(String[] args) {
		Square obj1=new Square(4.0f);
		obj1.calarea();
		System.out.println(obj1);
		obj1.show();
		
		
	}
	
		
	}
	



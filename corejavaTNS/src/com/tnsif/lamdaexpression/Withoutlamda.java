package com.tnsif.lamdaexpression;

public class Withoutlamda implements Myinterface {
	@Override
	public void show() {
		System.out.println("Hey, this is working without lamda");
	}
	public static void main(String[] args) {
		Withoutlamda L = new Withoutlamda();
		L.show();
	}
	

}

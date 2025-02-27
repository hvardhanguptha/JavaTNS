package com.tnsif.multithreading;
// multithreading program

class Amazon extends Thread {
	public void run() {
		System.out.println("Amazon"+ Thread.currentThread());
	}
	
}
class Flipkart extends Thread{
	public void run() {
		System.out.println("Flipkart"+ Thread.currentThread());
	}

	
	
}
class Chrome extends Thread{

	public void run() {
		System.out.println("Chrome"+ Thread.currentThread());
	}

	
}

public class Maindemo {
	public static void main(String[] args) {
		System.out.println("MainMethod"+ Thread.currentThread());
		Amazon A=new Amazon();
		Flipkart F= new Flipkart();
		Chrome C= new Chrome();
		A.start();
		F.start();
		C.start();
		
		
		
	}
	

}

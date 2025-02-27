package com.tnsif.multithreading;

public class Demo extends Thread{
	public void run () {
		int i;
		
		for(i=0;i<10;i++) {
			System.out.println("hello"+Thread.currentThread().getId());
			try {
				sleep(10000);
			}
			catch(Exception e){
				System.out.println(e);			
			}			
		}		
	}
		public static void main(String args[]) {
			Demo d = new Demo();
			d.start();	
		}
}
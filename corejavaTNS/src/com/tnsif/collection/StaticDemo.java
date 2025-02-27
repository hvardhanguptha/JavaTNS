package com.tnsif.collection;
import java.util.Stack;


public class StaticDemo {
	public static void main(String[] args) {
		Stack<Integer> ob = new Stack<Integer>();
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.pop();
		System.out.println("stack operations are performed"  + ob);
		System.out.println(ob.peek());
		if(ob.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Not Empty");
			
		}
		System.out.println(ob.search(7));
		
		
		
		
		
	}
	
	
	
	

}

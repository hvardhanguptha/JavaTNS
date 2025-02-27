package com.tnsif.lamdaexpression;

import java.util.ArrayList;

public class Arraylistdemo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(16);
		a.forEach(list->System.out.println(list));
		
	}

}

package com.tnsif.junitprogram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		Demo d = new Demo();
		int actual = d.add(5, 10);
		int expected =19;
		if(actual==expected) {
			System.out.println("passed");
			
		}
		else {
			System.out.println("fail");
		}
		
	}
	

}

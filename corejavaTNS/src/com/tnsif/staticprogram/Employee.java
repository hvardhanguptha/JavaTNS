package com.tnsif.staticprogram;

public class Employee {
	int eid;
	String name;
	static String companyName="TCS";
	Employee(int r, String n){
		eid=r;
		name=n;
	
	}
	static void change() {
		companyName= "IBM";
	}
	
	void display() {
		System.out.println(eid+" "+name+" "+ companyName);
		
	}
	public static void main(String args[]) {
		Employee.change();
	    Employee e1= new Employee(1,"harsha");
	    Employee e2= new Employee(2,"ajay");
	    Employee e3= new Employee(3,"uday");
	    e1.display();
	    e2.display();
	    e3.display();
	    
		
	}

}

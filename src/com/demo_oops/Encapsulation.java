package com.demo_oops;

public class Encapsulation {
	
	public static void main(String[] args) {
		
		//classname Objectname/ref name = new classname();
		
		Encapsulation e = new Encapsulation();
		
		e.employee_name();
		e.employee_id();
		e.employee_designation();
		e.employee_qualification();
		e.company();
		e.city();		
	}
	
	public void employee_name() {
		System.out.println("keirthi");	
	}
	private void employee_id() {
		System.out.println("HM3456");	
	}
	protected void employee_designation() {
		System.out.println("Automation Tester");	
	}
	void employee_qualification() {
		System.out.println("B.COM,CA");	
	}
	public void company() {
		System.out.println("Shimakh Technology");	
	}
	public void city() {
		System.out.println("bangalore");
	}
	

}

package com.polymorphism;


public class MethodOverloading {
	//mobile I-phone features or specification
	public void mobile_launch() {
		System.out.println("There are the specafications provided below:-");	
	}
	public void mobile_launch (String mobile_Name, String Brand_name ) {
		System.out.println(mobile_Name +" "+Brand_name); //CONCORDINATION
	}
	public void mobile_launch (String Ram ,String processor,String storage) {
		System.out.println(Ram+" "+processor+" "+storage);
		
	}
	public void mobile_launch(long IMA_Number ,String colour,String display) {
		System.out.println(IMA_Number +" "+colour+" "+display);
	}
	public void mobile_launch(String simcard_type) {
		System.out.println(simcard_type);
		
	}
	public void mobile_launch(float price) {
		System.out.println(price);
		
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.mobile_launch();
		m.mobile_launch("I-Phone15pro", " APPLE");
		m.mobile_launch("12GP", "IOS", "256GP");
		m.mobile_launch(8976543456l, "Pink", "6.5inch");
		m.mobile_launch("E_sim");
		m.mobile_launch(98678.890f);
		
		
	}
	
	
	
	}



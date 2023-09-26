package com.methodoverriding;

public class Customer_1 extends Bank_Details{
@Override
	public void customer_details(String name ,String city) {
	super.customer_details(name, city);
			
	}
@Override
    public void customer_details(long mobile_no ,int age) {
    	super.customer_details(mobile_no, age);
	
}
@Override
    public void customer_details(String IFSC_code ,long Locker_no) {
    	super.customer_details(IFSC_code, Locker_no);
		
	}
@Override
    public void customer_details(long Account_no ,String branch) {
    	super.customer_details(Account_no, branch);
		
	}

    public static void main(String[] args) {
		Customer_1 c=new Customer_1();
		c.customer_details("Ramu", "chennai");
	    c.customer_details(8248002358l, 34);
		
	}
	

}

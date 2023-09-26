package com.methodoverriding;
public class Bank_Details {
	public void customer_details(String name , String city) {
		System.out.println(name +" "+city);	
	}
	public void customer_details(long mobile_no ,int age) {
		System.out.println(mobile_no +" "+age);
	}
	public void customer_details(String IFSC_Code ,long locker_no) {
		System.out.println(IFSC_Code+" "+locker_no);
	}
	public void customer_details(long Account_no ,String branch) {
		System.out.println(Account_no+" "+branch);	
	}
	 static class  customer_1 extends Bank_Details {
		@Override
		public void customer_details(String name ,String city) {
			super.customer_details(name, city);	
		}
		@Override
		public void customer_details(long mobile_no , int age) {
			super.customer_details(mobile_no, age);
			
		}
		@Override
		public void customer_details(String IFSC_code ,long locker_no) {
			super.customer_details(IFSC_code, locker_no);
			
		}
		@Override
		public void customer_details(long Account_no ,String branch) {
			super.customer_details(Account_no, branch);
			
		}
		public static void main(String[] args) {
			customer_1 c=new customer_1();
			c.customer_details("obukeirthi", "salem");
			c.customer_details(123456789, 21);
			c.customer_details("HDFCOO34", 23456789175l);
			c.customer_details(0000324567432l, "GUGAI");
			
		}
	}
	  
	  
	   

}
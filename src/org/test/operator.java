package org.test;

public class operator {
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("name");
		try {  
		 System.out.println(10/3);
		} 
		catch(ArithmeticException Exception ) {
			System.out.println("dont by zero");
		}
		finally {
			System.out.println("final");
			
		}
		System.out.println("end");
		}
			
	
	}



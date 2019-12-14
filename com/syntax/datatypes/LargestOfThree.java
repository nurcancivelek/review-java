package com.syntax.datatypes;

public class LargestOfThree {
	public static void main(String[] args) {
		//Write a program to find if the largest Number of three numbers
	    //Print out  System.out.println("Largest number is " + largestNumber);
	     // Must use if then a else if and lastly else
			
		int num1=1;
		int num2=8;
		int num3=6;
		
		if(num1>num2 && num1>num3) {
			
			System.out.println(num1+" is the greatest" );
			
		}else if(num2>num1 && num2>num3) {
			
				System.out.println(num2+" is the greatest" );
		}
		else  {
			
				System.out.println(num3+" is the greatest" );
						
		}		
	}
}	

package com.syntax.datatypes;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		//Write a program to find if a number is even or odd 
	    //Print out  "My number must be even" or "My number must be odd" 
	    // Must use if else

		Scanner scan=new Scanner(System.in);
		System.out.println("pls enter a number");
		int number=scan.nextInt();
		
		if(number%2==0) {
			System.out.println("even number");
			
		}else {
			System.out.println("odd number");
		}
		
		
		
		
		
		
		
	}

}

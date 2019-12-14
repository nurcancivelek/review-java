package com.syntax.class3;

import java.util.Scanner;

public class NestedTempr {

	public static void main(String[] args) {
		
	
	
	
		//Write a program that prints out if it is good weather to go for a bike ride.
		//The weather is good if the temperature is between 60 degrees and 100 degrees 
		//inclusive unless it is raining. If temperature is less than 60 program should say
		//it is too cold, if the temperature is more than 100, program should say it is too hot.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp=scan.nextInt();
		
		//boolean rain=false;
		
		if(temp<40) {
			System.out.println("too cold");
		}else if(temp>100) {
			System.out.println("too hot");
		}else {
			System.out.println("is it raining?");
			boolean rain=scan.nextBoolean();
			if(rain) {
				System.out.println("raining, no biking");
			}else {
				System.out.println("yes to biking");
			}
				
			
		}
		
	}	
		
}

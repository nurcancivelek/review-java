package com.syntax.forloop;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
	
	
	
	int num = 10;
	while (num <= 7) {
	System.out.println("Hello");
	num++;
	}
	// rare
	int num1 = 10;
	do {
	System.out.println("Bye");
	num1++;
	} while (num1 <= 7);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
	// print even numbers from 20 to 50 using do while
	// 1 way
	int even = 20;
	do {
	System.out.println(even);
	even += 2;
	} while (even <= 50);
	System.out.println("-------------Second way---------");
	// 2 way
	int even1 = 20;
	do {
	if (even1 % 2 == 0) {
	System.out.println(even1);
	}
	even1++;
	} while (even1 <= 50);
	
//  Task One
    //Write a program using a do while loop to print out all odd number from 0 15 
	
	int c=0;
	do {
		if(c%2==1) {
			System.out.print(c+ " ");
		}
		c++;
		
	}while(c<=15);
	
	System.out.println(" ");

    //   Task Two
  // *keep asking user to pay for candy until entered price is not equal to 3
   //  *after user got a write amount print "Please enjoy your candy"*/  
	Scanner scan=new Scanner(System.in);
	int price;
	do {
		System.out.println("Please pay for the candy");
		price=scan.nextInt();
	}while(price==3);
	
	System.out.println("Please enjoy your candy");
	
	}
}

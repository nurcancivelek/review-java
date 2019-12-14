package com.syntax.class3;

import java.util.Scanner;

public class SwitchLevel {
public static void main(String[] args) {
	
	//Task 2
	// Write a program to found out the user level of experience 
	// Must use a switch statement with  a String variable named levelString and a int variable named level 
	// Beginner level should be 1
	// Intermediate level should be 2
	// Expert level should be 3

	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your level");
	int level=scan.nextInt();
	String theLevel;

		switch(level) {
		case 1:
			theLevel= "Beginner";
			break;
		case 2:
			theLevel= "Intermediate";
			break;
		case 3:
			theLevel= "Expert";
			break;	
		default	:
			theLevel= "no level";
		}
		System.out.println("Your level is "+theLevel);
	
	
}
}

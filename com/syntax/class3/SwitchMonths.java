package com.syntax.class3;

import java.util.Scanner;

public class SwitchMonths {
	
	public static void main(String[] args) {
		
		//Task 1
		//Write a program that will use a switch statement to display what month we're in.
		
		Scanner scan=new Scanner(System.in);
		//String month;
		System.out.println("Enter a number between 1-12 to determine the month we're in");
	    int month=scan.nextInt();
	    String isMonth=scan.nextLine();
	   
	   switch(month) {
	     case 1: 
	     isMonth="January";
	     break;
	     case 2: 
	       isMonth= "February";
	     break;
	     case 3: 
	       isMonth= "March";
	     break;
	     case 4: 
	       isMonth="April";
	     break;
	     case 5:
	       isMonth= "May";
	     break;
	     case 6: 
	       isMonth= "June";
	     break;
	     case 7: 
	       isMonth= "July";
	     break;
	     case 8: 
	       isMonth="August";
	     break;
	     case 9:
	       isMonth= "September";
	     break;
	     case 10:
	       isMonth= "October";
	     break;
	     case 11: 
	       isMonth= "November";
	     break;
	     case 12: 
	       isMonth= "December";
	     break;
	     default: 
	     isMonth= "Invalid";
	   }
	    System.out.println("we are in " +isMonth);    
	  }
	}


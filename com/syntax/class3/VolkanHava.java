package com.syntax.class3;

import java.util.Scanner;

class VolkanHava {
	public static void main(String arg[]) {
		// I am getting input
		Scanner scan = new Scanner(System.in);
		String gender = scan.next();
		int age = scan.nextInt();
        
	    if(age > 25){
	      if( gender.equals("M")) {
	    	  System.out.println("Man");
	      }else {
	          System.out.println("Woman");
	      }
	    }else{
	        if( gender.equals("M")) {
	            System.out.println("Boy");
	        } else {
	            System.out.println("Girl");
	        }
	    }
    }
}
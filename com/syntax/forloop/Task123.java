package com.syntax.forloop;

import java.util.Scanner;

public class Task123 {
	
	public static void main(String[] args) {
		
//		Task One			
/* print only even numbers from 1 to 20 */
		
		int a=1;
		while (a<=20) {
			if(a%2==0) {
				System.out.println(a);	
			}
				a++;
	
		}
	
		//Task Two
		// how to print numbers from 5 to 25 inclusive all in 1 line with space in
		//between?

		int e=5;
		while(e<=25) {
			System.out.print(e+" ");
			e++;
		}
		//Task Three 
		// Prompt the user to ask the name 3 times and print "Hello____" */

	int b=1; 
	
	while(b<=4) {
		System.out.println("Hello");
		b++;
	}
	Scanner scan=new Scanner(System.in);
	
	int v=1;
	String name=null;
	while(v<4) {
		
		System.out.println("What is your name");
		name=scan.nextLine();
		v++;
		System.out.println("Hello "+name);
		
	}
	
  }
}


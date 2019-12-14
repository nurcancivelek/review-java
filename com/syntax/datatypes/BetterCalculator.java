package com.syntax.datatypes;

import java.util.Scanner;

public class BetterCalculator {
	public static void main(String[] args) {
		//int a=10;
		//int b=12;
		//String name1="John";
		//String name2="Smith";
		//System.out.println(a==b); //a equals b de denebilir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter in first number: ");
		int num1=scan.nextInt();
		System.out.println("enter in second number: ");
		int num2=scan.nextInt();
		System.out.println("enter in operator: ");
		String operator=scan.next();
		if(operator.equals("+")) {
			System.out.println(num1+num2);
		}else if(operator.contentEquals("-")) {
			System.out.println(num1-num2);
		}else if(operator.contentEquals("/")) {
			System.out.println(num1/num2);
		}else if(operator.contentEquals("*")) {
			System.out.println(num1*num2);
		}else {
			System.out.println("Invalik operator or number entered");

		}

		
		
		
	}
}

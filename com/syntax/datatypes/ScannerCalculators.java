package com.syntax.datatypes;

import java.util.Scanner;

public class ScannerCalculators {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("enter in first number");
		int num1=scan.nextInt();
		System.out.print("enter in second number");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
	}

}

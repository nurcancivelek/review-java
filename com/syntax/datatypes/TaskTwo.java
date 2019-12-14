package com.syntax.datatypes;

public class TaskTwo {
	public static void main(String[] args) {
		int num=99;
		if(num<100) {
			if(num>=10) { 
				System.out.println("2 digit");	
			}
			
		}else if(num<1000) {
			System.out.println("3 digit");
		}else if(num<10000) {
			System.out.println("4 digit");
		}else {
			System.out.println("error");
		}
	}
}

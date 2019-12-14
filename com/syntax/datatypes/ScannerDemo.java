package com.syntax.datatypes;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
	
	//scanner is a class present in java.util package
	//which allows us to take user input
		//macusers:commnd+shift+O
		//windiws user shortcut:ctrl+shft+O
	
		Scanner key=new Scanner(System.in);
		System.out.print("enter a name");
		String name=key.next(); //nextline olursa birden fazla kelimeyi de verir. 
		//sadece next olursa o zaman tek bir kelimeyi verir, spaceen sonrasini vermez
		System.out.println(name);
}
}
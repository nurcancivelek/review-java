package com.syntax.class3;

import java.util.Scanner;

public class Odev39 {
	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter name of the instructor");
	  String name=scan.nextLine();
	  String assignment;
	  switch(name) {
	    case "Shiva":
	        assignment="Java";
	        System.out.println(name+" will take care of "+assignment+" Assignment");
	        break;
	    case "Sandish":
	      assignment="SDLC";
	      System.out.println(name+" will take care of "+assignment+" Assignment");
	      break;
	    case "Weqas":
	      assignment="Selenium";
	      System.out.println(name+" will take care of "+assignment+" Assignment");
	      break;
	    case "Asel":
	      assignment="every";
	      System.out.println(name+" will take care of "+assignment+" Assignment");
	      break;
	    default:
	      assignment="Invalid instructor selected";
	      System.out.println("Invalid instructor selected");
	  }
	}
}


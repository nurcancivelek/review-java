package com.syntax.class3;

import java.util.Scanner;

public class NestedTemperature {
	public static void main(String[] args) {
	
	//Write a program that prints out if it is good weather to go for a bike ride.
	//The weather is good if the temperature is between 60 degrees and 100 degrees 
	//inclusive unless it is raining. If temperature is less than 60 program should say
	//it is too cold, if the temperature is more than 100, program should say it is too hot.
	
	Scanner scan;
    boolean snow, rain, sunny;
    int temp;
    String activity;

    scan = new Scanner(System.in);

    System.out.println("Please enter a temperature");

    temp = scan.nextInt();

   if (temp >= 40 && temp < 80) {
        System.out.println("Is it raining?");
        rain = scan.nextBoolean();

        if (rain) {
            activity = "Watch a movie";
        } else {
            activity = "Go hiking";
        }
    } else if (temp >= 25 && temp < 40) {
        System.out.println("Is it snowing?");
        snow = scan.nextBoolean();
        if (snow) {
            activity = "Snowboarding";
        } else {
            activity = "Let’s code";
        }
    } else if (temp >= 80) {
        System.out.println("Is it sunny");
        sunny = scan.nextBoolean();
        if (sunny) {
            activity = "Go to the beach";
        } else {
            activity = "Do more coding";
        }
    } else {
        System.out.println("Please enter different temperature");
        activity = "Unknown";
    }
    
    System.out.println("My activity for today is " + activity);


	}
}





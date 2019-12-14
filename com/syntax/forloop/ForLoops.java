package com.syntax.forloop;

public class ForLoops {
	public static void main(String[] args) {
		
		for (int i=0;    i<=4;           i++) {
			System.out.println("Good morning");
			}
			System.out.println( " " );
			//print numbers from 1-10;
			for (int i=1; i<=10; i++) {
			System.out.print(i+ " ");
			}
			System.out.println( " " );
			//print numbers from 10-1
			for (int i=10; i>=1; i--) {
			System.out.print(i+" ");
			}
			System.out.println( " " );
			for (int i=0; i<=50; i+=5) {
			System.out.print(i+ " ");//5, 10, 15, 20
			}
	
	
			for (int i = 0; i < 10; i++) {
				if (i == 4) {
				break;
				}
				System.out.println(i);
				}
				System.out.println("**********************");
				// continue - it will skip CURRENT iteration
				for (int i = 1; i <= 5; i++) {
				if (i == 3 || i == 4) {
				continue;
				}
				System.out.print(i+ " ");
				}System.out.println(" ");
				System.out.println("*******************");
				// I want to print nums from 1 to 20 except 5,6,7
				for (int a = 1; a <= 20; a++) {//5
				if (a >=5 && a<=7) {
				continue;
				}
				System.out.print(a+ " ");
				}
				System.out.println(" ");
				// Task 0ne Print numbers from 10 to 1
				for(int x=10; x>=1; x--) {
					System.out.print(x+" ");
				}
				System.out.println( " ");
				// Task Two Write a program from 40 to 10 and only print the even numbers
				for(int v=40; v>=10; v--) {
					if(v%2==0) {
						System.out.print(v+" ");
					}
				}
			    // Task Three Write a program from 50 to 25 and only print the odd numbers
				for(int v=50; v>=25; v--) {
					if(v%2==1) {
						System.out.print(v+" ");
					}
				}
				// Task Four Write a program from 0 to 100 and break the loop once the value  reaches 45
				for(int v=0; v<=100; v++) {
					if(v==45) {
						System.out.print(v+" ");
						break;
					}
				}
				// Task Five Write a program  1 to 10 and if the value is 10 
				for(int v=1; v<=10; v++) {
					if(v==5) {
						continue;
					}
					System.out.print(v+" ");
				}
				
}
}
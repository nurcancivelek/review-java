package Review7;

public class Baby {
	
	
	char gender;
	String hairColor, firstName, lastName;
	int weight;
	
	void talk() {
		System.out.println("Bla bla bla");
	}
	void walk(int times) {
		System.out.println("Crawl");
	}
	void cry() {
		System.out.println("cry every minute");
	}
	void displayBabyInfo() {
		System.out.println("full name is "+firstName+ " "+lastName);
		System.out.print("gender is: ");
		 if(gender=='m') {
			 System.out.println("Boy");
		 }else if(gender=='f') {
			 System.out.println("Girl");
		 }else {
			 System.out.println("Unknown");
		 }
		System.out.println("hair color is "+hairColor);
		
		//System.out.println("--------------");
		
		
	}
	
		
	
}

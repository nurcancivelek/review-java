package Review7;

public class World {
	
	public static void main(String[] args) {
		
	
	
	Baby baby1= new Baby();
	baby1.firstName="John";
	baby1.lastName="Doe";
	baby1.gender='m';
	baby1.hairColor="Yellow";
	baby1.weight=7;
	
	System.out.println(baby1.gender);
	System.out.println(baby1.firstName);
	baby1.walk(3);
	
	Baby baby2= new Baby();
	baby2.firstName="Mary";
	baby2.cry();
	baby2.lastName="Smith";
	baby2.hairColor="Black";
	baby2.gender='f';
	baby2.weight=6;
	
	baby2.cry();
	baby2.talk();
	System.out.println("full name of the baby2 is "+baby2.firstName+" "+baby2.lastName);
	
	System.out.println("----------");
	baby2.displayBabyInfo();
	baby1.displayBabyInfo();
	}
}

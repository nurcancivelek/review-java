package Review9;

public class CarDisplay {

	public static void main(String[] args) {
		
		
	SuperCar car1=new SuperCar("Mercedes", "GLS450", "SUV","Navy", 2020, 250, 7, 4 );
	SuperCar car2=new SuperCar("Tesla","X","Navy", 2020, 250);
	SuperCar car3=new SuperCar("BMW", ("X7"),  2020, "White", true);
	SuperCar car4=new SuperCar("Wolkswagen","Atlas", "Black", 8);
	
	car1.Info();
	System.out.println();
	car2.Info();
	System.out.println();
	car3.Info();
	System.out.println();
	car4.Info();
	
	}

}

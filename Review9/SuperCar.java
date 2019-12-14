package Review9;

public class SuperCar {

	//Create a SuperCar class.
	//It should have at least 10 variables, like : make, brand, year,
	//manufacture, axle, tireNumber,,,
	//Create at least 4 Constructors with different number of parameters.

	//public static SuperCar car1;
	String make;
	String model;
	String style;
	String color;
	int year;
	
	boolean sunroof;
	
	
	
	int mph;
	int seats;
	int doors;
	
	public SuperCar (String make,String model, String style,
			String color , int year,int mpg,int seats, int doors) {
		this.make=make;
		this.model=model;
		this.style=style;
		this.color=color;
		this.year=year;
		this.mph=mph;
		this.seats=seats;
		this.doors=doors;
		
		
	}
	public SuperCar(String make, String model, String color, int year, int mph) {
		this.make=make;
		this.model=model;
		this.color=color;
		this.year=year;
	}
	public SuperCar(String make, String model, int year, String color, boolean sunroof){
		this.make=make;
		this.model=model;
		this.year=year;
		this.sunroof=sunroof;
		
	}
	public SuperCar(String make, String model, String color, int seats ) {
		this.make=make;
		this.model=model;
		this.color=color;
		this.seats=seats;
	}
	public void Info() {
		System.out.println("Make: "+make+", Model: "+model +", Color: " + color+ ", Style: " + style+ ", Year: "
				+year+", Mile Per Hour: "+mph+", Seating capacity: "+seats+", and has:  "+doors+" doors");
	}

}

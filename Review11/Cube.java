package Review11;

public  class Cube  extends Shape3D{

	double side;
	public Cube(double side, String color){
		super(color);
		this.side=side;
	}
	@Override
	public double calculateVolume() {
		
		return side*side*side;
	}
	@Override
	public double calculateArea() {
		
		return side*side*6;
	}
}

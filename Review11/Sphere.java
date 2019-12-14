package Review11;

public class Sphere  extends Shape3D{

	int radius;
	public Sphere(int radius, String color) {
		super(color);
		this.radius=radius;
	}
	@Override
	public double calculateVolume() {
		
		return (4*pi*radius*radius);
	}
	@Override
	public double calculateArea() {
		
		return ((4/3)*pi*radius*radius);
	}
}

package Review11;

public class Shape3DTest {

	public static void main(String[] args) {
		Shape3D[] shapes = new Shape3D[4];
		shapes[0] =  new Sphere( 4, "yellow");
		shapes[1] = new Cube(2, "brown");
		shapes[2] =new Sphere(4,  "green");
		shapes[3] = new Cube(3, "black");

		double totalArea = 0;
		for (Shape3D shape : shapes) {
			totalArea += shape.calculateArea();
		}
		System.out.println("Total area is " + totalArea);


		double totalVolume=0.0;
		for(Shape3D shape:shapes) {
			totalVolume+=shape.calculateVolume();
		}
		System.out.println("Total volume is " + totalVolume);
	}

}

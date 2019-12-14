package Review11;

public abstract class Shape {

	String color;
	double pi=3.14;
	public Shape(String color){
		this.color=color;
	}
	public abstract double calculateArea();
}

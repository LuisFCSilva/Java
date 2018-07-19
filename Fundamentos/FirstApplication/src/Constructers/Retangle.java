package Constructers;

public class Retangle {

	private double width;
	private double height;
	
	
	public Retangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return this.width * this.height;
	}
	
}

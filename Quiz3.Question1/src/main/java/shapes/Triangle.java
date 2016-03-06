/* John Bounds - 3/5/16 - CISC181 - Quiz3Question1
 * This is a class called Triangle. It stores information on the sides of the triangle, its area, and its perimeter.
 * All of these variable can be returned. Area and perimeter are calculate using methods within object
 * Triangle extends GeometricsObject. It contains a toString() method which returns information on the triangle
 */
package shapes;

public class Triangle extends GeometricObject{
	//Default values
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	//no arg constructor
	public Triangle(){
	}
	//arg constructor
	public Triangle(double side1, double side2, double side3){
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
	//private setters, public getters
	public double getSide1() {
		return side1;
	}

	private void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	private void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	private void setSide3(double side3) {
		this.side3 = side3;
	}
	//returns area of triangle using Heron's formula
	public double getArea(){
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	//returns perimeter of triangle
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	//returns a string description of the triangle
	public String toString(){
		//first get values from other methods
		double area = getArea();
		double perimeter = getPerimeter();
		return ("Your triangle's three sides are:\nSide 1:" + side1 + "\nSide 2:" + side2
				+ "\nSide 3: " + side3 + "\nIts area is: " + area + "\n Its perimeter is: " + perimeter);
	}
}

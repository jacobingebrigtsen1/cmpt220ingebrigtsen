//package project8;
public class Circle {
	 
	protected double radius;
	protected String color;
	public Circle() {
		radius = 1.0;
	}
	public Circle(double r) {
		radius = r;
	}
	public Circle(double r,String c) {
		radius = r;
		color= c;
	}
	
	public void setRadius(double r) {
		r = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	public double getArea() {
		return Math.PI  * Math.pow(radius, 2);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String c)
	{
		color=c;
	}
	public String toString()
	{
		return "Cirlce[radius="+this.radius+",color="+this.color+"]";
	}
}
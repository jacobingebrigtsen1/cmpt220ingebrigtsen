package project8;
public class Cylinder extends Circle {
	private double height;
	public Cylinder()
	{
		radius=1.0;
		color="red";
		height=1.0;
	}
	
	public Cylinder(double r)
	{
		radius=r;
		color="red";
		height=1.0;
	}
	
	public Cylinder(double r,double h)
	{
		radius=r;
		color="red";
		height=h;
	}
	
	public Cylinder(double r, double h , String c)
	{
		radius=r;
		color=c;
		height=h;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double h)
	{
		height=h;
	}
	public double getVolume()
	{
		return 3.1415*(this.radius*this.radius)*this.height;
	}
}

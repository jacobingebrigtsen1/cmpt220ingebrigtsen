import java.lang.Math;
public class Circle {

    private final double PI = 3.14159;
    private double radius;
    private double x,y;
    public Circle() {
        radius = 0.0;
        x=0;
        y=0;
    }

    public Circle(double X,double Y,double r) {
        radius = r;
        x=X;
        y=Y;
    }

    public void setRadius(double r) {
        radius = r;
    }
    public String getCenter() {
    	return (x+","+y);
    }
    public double getX() {
    	return x;
    }
    public double getY() {
    	return y;
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }
    public double getPerimeter() {
        return radius * PI * 2;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
    public boolean contains(double X,double Y) {
    	return((x-X)*(x-X)+(y-Y)*(y-Y)<=radius*radius);
    }
    public boolean contains(Circle test) {
    	int distSq = (int)Math.sqrt(((x - test.getX())  * (x - test.getX()))   + ((y - test.getY())  * (y - test.getY())));  
        if (distSq + test.getRadius() == radius)  
           return true;
        else if (distSq + test.getRadius() < radius)  
           return true;
        return false;
    }
    public boolean overlaps(Circle test) {
    	double distance = Math.hypot(x-test.getX(), y-getY());
    	return(distance<(radius+test.getRadius()));
    }
    
}


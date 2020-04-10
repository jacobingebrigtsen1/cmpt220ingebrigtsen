
public class circletest {
	    public static void main(String[] args) {
	    	Circle c1=new Circle(2,2,5.5);
	    	System.out.println(c1.getArea());
	    	System.out.println(c1.getPerimeter());
	    	System.out.println(c1.contains(3,3));
	    	System.out.println(c1.contains(new Circle(4,5,10.5)));
	    	System.out.println(c1.overlaps(new Circle(3,4,2.3)));
	    	//personal testing
	    	System.out.println("personal test");
	    	Circle c2=new Circle(2,2,10);
	    	System.out.println(c2.contains(-7,6));
	    	System.out.println(c2.contains(-4,10));
	    	System.out.println(c2.contains(7,11));
	    	System.out.println(c2.contains(9,-5));
	    }
}
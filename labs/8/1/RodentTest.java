package project8;

public class RodentTest {
	public static void main(String[] args) {
		Rodent rod=new Rodent();
		Rodent ham=new Hamster();
		Rodent Mou=new Mouse();
		Rodent Ger=new Gerbil();
		
		rod.breath();
		rod.eat();
		rod.move();
		
		ham.breath();
		ham.eat();
		ham.move();
		
		Mou.breath();
		Mou.eat();
		Mou.move();
		
		Ger.breath();
		Ger.eat();
		Ger.move();
		
	}
}

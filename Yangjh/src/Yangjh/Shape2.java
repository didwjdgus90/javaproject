package Yangjh;

class Shapes {
	protected int x, y;
}
class Rectangle1 extends Shapes{
	private int width,height;
}
class Triangle extends Shapes{
	private int base,height;
}
class Circle extends Shapes{
	private int radius;
}

public class Shape2{
	public static void main(String arg[]){
		Shapes s1,s2;
		
		s1 = new Shapes();
		s2 = new Rectangle1();
	}
}

package Yangjh;

class Shapes3 {
	protected int x,y;
	public void draw(){
		System.out.println("Shape Draw");
	}
}
class Rectangle2 extends Shapes3 {
	private int width,height;
	public void draw(){
		System.out.println("Rectangle Draw");
	}
}

class Triangle2 extends Shapes3 {
	private int base,height;
	public void draw(){
		System.out.println("Triangle Draw");
	}
}
class Circle2 extends Shapes3 {
	private int radius;
	
	public void draw(){
		System.out.println("Circle Draw");
	}
}

public class Shape3 {
	public static void main(String args[]){
		Shapes3 s1, s2, s3, s4;
		
		s1  = new Shapes3();
		s2  = new Rectangle2();
		s3  = new Triangle2();
		s4  = new Circle2();
		
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}
}

package Yangjh;

public abstract class Shape1 {
	private int x,y;
	public void move(int x , int y){
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
}

class Rectangles1 extends Shape1 {
	private int width,height;
	public void draw(){
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
}

class Circle1 extends Shape1 {
	private int radius;
	public void draw(){
		System.out.println("�� �׸��� �޼ҵ�");
	}
}
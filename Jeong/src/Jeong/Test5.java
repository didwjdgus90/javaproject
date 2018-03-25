package Jeong;

public class Test5 {
	int s;
	public static void main(String [] args) {
		Test p = new Test();
		p.sub();
	}
	
	void sub() {
		int x = 5;
		setDouble(x);
		System.out.print(x + "");
		System.out.println(s);
	}
	
	void setDouble(int x) {
		x = x*2;
		s = x;
	}
}

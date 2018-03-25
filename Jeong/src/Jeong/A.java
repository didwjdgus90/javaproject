package Jeong;

public class A {
	public A(int x){}
}
class B extends A {}
public class Test
{
	public static void main (String args[]) {
		A a= new B();
		System.out.println("실행 완료");
	}
}

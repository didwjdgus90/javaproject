package Yangjh;

class C {
	C(){}
}
class B extends C {
	B(){}
}
public class A {
	public static void main(String[] args) {
		C a = new B();
	}
}
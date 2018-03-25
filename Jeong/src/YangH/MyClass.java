package YangH;

public class MyClass {
	private String getName() {
		return "MyClass";
	}
	private static String getClassName() {
		return getName();
	}
}
class Mymath {
	public int getRandom1() {
		return (int)Math.random();
	}
	public double getRandom() {
		return Math.random();
	}
}
class MyClass1 {
	private static String getName1() {
		return "Myclass";
	}
	public static String getClassName() {
		return getName1();
	}
}


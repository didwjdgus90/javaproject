package YangH;

public class MyMetric {
	private static double distance;
	public static double kiloToMile(double d) {
		distance  = d / 1.6093;
		return distance;
	}
	public static void miletoKilo(double d) {
		distance = d * 1.6093;
	}
}

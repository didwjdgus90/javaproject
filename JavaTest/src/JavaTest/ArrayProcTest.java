package JavaTest;

public class ArrayProcTest {
	final static int STUDENTS = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		obj.getValues(scores);
		System.out.print("∆Ú±’¿∫ ="+obj.getAverage(scores));
	}

}

package Hoon;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Badbank b = new Badbank();
		Nomalbank n = new Nomalbank();
		Goodbank g = new Goodbank();
		System.out.println("Badbank�� ������ :"+b.getInterestRast());
		System.out.println("Nomalbank�� ������ :"+n.getInterestRast());
		System.out.println("Goodbank�� ������ :"+g.getInterestRast());
	}

}

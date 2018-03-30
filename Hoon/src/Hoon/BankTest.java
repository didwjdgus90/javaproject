package Hoon;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Badbank b = new Badbank();
		Nomalbank n = new Nomalbank();
		Goodbank g = new Goodbank();
		System.out.println("Badbank의 이자율 :"+b.getInterestRast());
		System.out.println("Nomalbank의 이자율 :"+n.getInterestRast());
		System.out.println("Goodbank의 이자율 :"+g.getInterestRast());
	}

}

package JavaTest;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("S600","red",80);
		Car c2 = new Car("S550","white",90);
		
		int n = Car.getNumberOfCars();
		System.out.println("지긍까지 생성된 자동차의 수 : "+n);
	}

}

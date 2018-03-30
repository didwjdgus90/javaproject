package Hoon;

public class Mnanager extends Employee {
	private int bonus;
	
	public Mnanager(String name,String address, int salary, int rrn, int bonus){
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	
	void test(){
		System.out.println("name ="+name);
		System.out.println("address ="+address);
		System.out.println("salary ="+ salary);
	}
}

package Jeongsin;

public class BankAccount {
	String name;
	int number,balance;
	double rate;
	
	public BankAccount(){}
	
	public void Bank(){
		name = "¾çÁ¤Çö";
		number = 0;
		balance = 0;
		rate = 0;
	}
	public BankAccount(String n, int a, int b, double r){
		name = n;
		number = a;
		balance = b;
		rate = r;
	}
	void setName(String n){
		this.name = n;
	}
	String getName(){
		return name;
	}
	void setNumber(int m){
		this.number = m;
	}
	int getNumber(){
		return number;
	}
	void setBalance(){
		this.balance = 0;
	}
	int getBalance(){
		return balance;
	}
	void setRate(){
		this.rate = 0;
	}
	double getRate(){
		return rate;
	}
}

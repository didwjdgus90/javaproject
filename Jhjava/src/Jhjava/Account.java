package Jhjava;
public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name =name;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		if(balance <= 0){
			this.balance=0;
		}else{
			this.balance =balance;
		}
	}
}

package YangH;

public class BankAccount {
	int accountNumber;
	String owner;
	int balance;
	
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		balance -= amount;
	}
	public String toString() {
		return "���� �ܾ��� " + balance + "�Դϴ�.";
	}
	public int transfar(int amount,BankAccount otherAccount) {
		otherAccount.deposit(amount);
		return (balance-amount);
	}
}

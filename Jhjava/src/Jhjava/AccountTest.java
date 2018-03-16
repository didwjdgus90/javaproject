package Jhjava;

import java.util.*;
public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account o = new Account();
		System.out.print("이름을 입력하세요 :");
		o.setName(sc.next()); 
		System.out.print("돈을 입력하세요 :");
		o.setBalance(sc.nextInt());
		
		System.out.println("이름 :"+o.getName()+"\n통장 잔고 :"+o.getBalance());
	}

}

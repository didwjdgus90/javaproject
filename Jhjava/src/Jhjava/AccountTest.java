package Jhjava;

import java.util.*;
public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account o = new Account();
		System.out.print("�̸��� �Է��ϼ��� :");
		o.setName(sc.next()); 
		System.out.print("���� �Է��ϼ��� :");
		o.setBalance(sc.nextInt());
		
		System.out.println("�̸� :"+o.getName()+"\n���� �ܰ� :"+o.getBalance());
	}

}

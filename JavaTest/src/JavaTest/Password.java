package JavaTest;
import java.util.*;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s;
		String id ="didwjdgus90";
		String pass ="1234567";
		Scanner scan = new Scanner(System.in);
		System.out.println("���̵� �Է� �ϼ��� :");
		s = scan.next();
		System.out.println("��� ��ȣ�� �Է� �ϼ��� :");
		s = scan.next();
		if( s.equalsIgnoreCase(id) && s.equalsIgnoreCase(pass) ) {
			System.out.println("�α����� �Ǿ����ϴ�.");
		}else {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		}
	}

}

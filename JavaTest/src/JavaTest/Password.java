package JavaTest;
import java.util.*;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s;
		String id ="didwjdgus90";
		String pass ="1234567";
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력 하세요 :");
		s = scan.next();
		System.out.println("비밀 번호를 입력 하세요 :");
		s = scan.next();
		if( s.equalsIgnoreCase(id) && s.equalsIgnoreCase(pass) ) {
			System.out.println("로그인이 되었습니다.");
		}else {
			System.out.println("로그인에 실패하였습니다.");
		}
	}

}

package Jeong;

public class Library {
	int book;// 도서관에 있는 책의 개수
	String kind;// 도서관에 있는 책의 종류
	String open;// 도서관이 열리는 시간
	String ftime;// 도서관을 닫는 시간
	
	void print () {
		System.out.println("도서관이 열리는 시간은"+open+"끝나는 시간은"+ftime+"입니다."+"\n도서관 책의 개수는 "+book+"개 입니다."+"\n책의 종류는"+kind+"등이 있습니다.");
	}
	
}
class Borrow{
	String id;//조건
	
	void print3(){
		System.out.println("빌리는 조건 :"+id+"을 가져오셔야 합니다.");
	}
}
class User{
	int month;//내가 빌린 월
	int day;// 내가 빌린 날
	int year;// 내가 빌린 년
	String bre;//내가 반납해야되는  날짜
	String ubookn;// 내가 빌린 책의 이름
	String ubookk;// 내가 빌린 책의 종류
	
	
	void print1(){
		System.out.println("이용자"+"\n내가 빌린 시간"+year+month+day+"\n내가 반납해야되는 날짜 "+bre+"안에 제출 해야됩니다."+"\n빌린 책의 이름 :"+ubookn+"\n빌린 책의 종류 :"+ubookk);
	}
	
}
class Manager{
	int year1;//빌린 년
	int day1;//빌린 날
	int month1;//빌린 월 
	int ryear;// 반납 해야되는 년
	int rday;// 반납 해야되는 날
	int rmonth;// 반날 해야되는 월
	String bookn;// 이용자가 빌린 책의 이름
	String name;// 이용자의 이름
	String bookk;// 이용자가 빌린 책의 종류
	String number;// 이용자의 정보
	
	void print2(){
		System.out.println("관리자"+"\n빌린 날짜 :"+year1+month1+day1+"\n반납 해야되는 날짜 :"+ryear+rday+rmonth+"\n빌린 책의 이름 :"+bookn+"\n빌린 책의 종류 :"+bookk+"\n빌린 사람의 이름:"+name+"\n빌린 사람의 전화번호 :"+number);
	}
}



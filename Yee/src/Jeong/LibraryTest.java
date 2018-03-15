package Jeong;

public class LibraryTest {
	public static void main(String[] args) {
		 Library book = new Library();
		 book.book=25000;
		 book.kind="[역사책 , 만화책, 동화책, 무협 소설 , 과학책 , 위인전]";
		 book.ftime="오후 8시";
		 book.open="오전 10시";
		 book.print();
		 
		 Borrow b = new Borrow();
		 b.id="신분증";
		 b.print3();
		 
		 User use = new User();
		 use.year=2018;
		 use.month=3;
		 use.day=15;
		 use.bre="일주일";
		 use.ubookn="삼국지";
		 use.ubookk="무협소설";
		 use.print1();
		 
		 Manager m = new Manager();
		 m.year1=2018;
		 m.month1=3;
		 m.day1=15;
		 m.ryear=2018;
		 m.rmonth=3;
		 m.rday=22;
		 m.bookn="삼국지";
		 m.name="양정현";
		 m.bookk="무협 소설";
		 m.number="010-7375-7616";
		 m.print2();
		 		 
	}

}

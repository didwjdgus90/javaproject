package Jeong;

public class LibraryTest {
	public static void main(String[] args) {
		 Library book = new Library();
		 book.book=25000;
		 book.kind="[����å , ��ȭå, ��ȭå, ���� �Ҽ� , ����å , ������]";
		 book.ftime="���� 8��";
		 book.open="���� 10��";
		 book.print();
		 
		 Borrow b = new Borrow();
		 b.id="�ź���";
		 b.print3();
		 
		 User use = new User();
		 use.year=2018;
		 use.month=3;
		 use.day=15;
		 use.bre="������";
		 use.ubookn="�ﱹ��";
		 use.ubookk="�����Ҽ�";
		 use.print1();
		 
		 Manager m = new Manager();
		 m.year1=2018;
		 m.month1=3;
		 m.day1=15;
		 m.ryear=2018;
		 m.rmonth=3;
		 m.rday=22;
		 m.bookn="�ﱹ��";
		 m.name="������";
		 m.bookk="���� �Ҽ�";
		 m.number="010-7375-7616";
		 m.print2();
		 		 
	}

}

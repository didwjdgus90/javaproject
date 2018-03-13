package Yang;

public class School {
	String d;
	String u;
	String t;
	String g;
	
	void print1(){
		System.out.println("학과 는 "+d+"있습니다."+"\n학교 교표는"+u+"입니다."+"\n학교 교목은"+t+"명 입니다."+"\n학교 교화는"+g+"입니다.");
	}
}
class Schooloffice {
	String t;
	void print2(){
		System.out.println("교물실에 선생님들은"+t);
	}
}
class Administrativeoffice {
	String b;
	void print3(){
		System.out.println("행정실은"+b);
	}

}
class Classroom {
	int d;
	int c;
	String s;
	void print4(){
		System.out.println("교실에 책상이"+d+"개 있고"+", 의자도"+c+"개 있다.");
	}
}

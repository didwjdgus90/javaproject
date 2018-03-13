package Yang;

public class Movie {
	String name;
	int year;
	String director;
	String writers;
	String star;
	double moviestar;
	int time;
	
	void print(){
		System.out.println("영화 제목은 :"+name+"\n상영날짜는 :"+year+"\n감독은 :"+director+"\n작가는 :"+writers+"\n배우는 :"+star+"\n평점은 :"+moviestar+"점"+"\n상영시간은 :"+time+"분");
	}
}

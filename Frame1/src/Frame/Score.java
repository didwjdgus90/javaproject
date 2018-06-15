package Frame;

public class Score{
	String name;
	int ko,en,ma,to,sc;
	
	public Score(String name,int ko,int en, int ma, int to, int sc){
		this.name = name;
		this.ko = ko;
		this.en = en;
		this.ma = ma;
		this.to = to;
		this.sc = sc;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getKo(){
		return ko;
	}
	public void setKo(int ko){
		this.ko=ko;
	}
	
}

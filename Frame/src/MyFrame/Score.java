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
	
	public int getEn(){
		return en;
	}
	
	public void setEn(int en){
		this.en = en;
	}
	
	public int getMa(){
		return ma;
	}
	
	public void setMa(int ma){
		this.ma = ma;
	}
	
	public int getTo(){
		return to = ko+en+ma;
	}
	
	public void setTo(int to){
		this.to=to;
	}
	
	public int getSc(){
		return sc=to/3;
		
	}
	
	public void setSc(int sc){
		this.sc=sc;
	}
	
	
}

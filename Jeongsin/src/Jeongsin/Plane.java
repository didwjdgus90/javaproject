package Jeongsin;

public class Plane {
	private String company;
	private String model;
	private static int  p_num;
	
	public void setCompany(String c){
		this.company = c;
	}
	public void setModel(String m){
		this.model = m;
	}
	public void setP_num(int p){
		this.p_num = p;
	}
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public static int getP_num() {
		return p_num;
	}
	public Plane(){}
	
	public void Company(String c,String m){
		company = c;
		model = m;
	}
	
	public void Company(String c,String m,int p){
		company = c;
		model = m;
		p_num = p;	
	}
	
	public String toString(){
		return "Á¦ÀÛ»ç"+company+"¸ðµ¨"+model+"¬‚´ë½Â°´¼ö"+p_num;
	}
}

package YangH;

public class Plane {
	private int num, p_num;
	private String model;
	private static int planes;
	public void setNum(int n) {
		num = n;
	}
	public void setPnum(int pn) {
		p_num = pn;
	}
	public void setModel(String m) {
		model = m;
	}
	public int getNum() {
		return num;
	}
	public int getPnum() {
		return p_num;
	}
	public String getModel() {
		return model;
	}
	public static void setPlanes(int p) {
		planes = p;
	}
	public static int getPlanes() {
		return planes;
	}
	public Plane() { }
	public Plane(int n, String m, int pn) {
		num = n;
		p_num  = pn;
		model = m;
	}
	public Plane(int n, String m) {
		num = n;
		model = m;
	}
	public String toString() {
		return "½Äº°¹øÈ£ : "+ getNum() + "¸ðµ¨ : " +getModel()+ "½Â°´ ¼ö :" + getPnum();
	}
	
}

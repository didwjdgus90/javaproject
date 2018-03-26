package Jeongsin;

public class Box {
	private int width,length,height;
	private boolean empty = false;
	
	public void  box()  {
		width = 0;
		length = 0;
		height = 0;
		empty  = true;
	}
	public Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
		empty = true;
	}
	
	void setWidth(int width){
		this.width= width;
	}
	int getWidth(){
		return width;
	}
	void setLength(int length){
		this.length=length;
	}
	int getLength(){
		return length;
	}
	void setheight(int height){
		this.height=height;
	}
	int getheight(){
		return height;
	}
	boolean isEmpty(){
		return empty;
	}
	void setEmpty(boolean empty){
		this.empty = empty;
	}
}


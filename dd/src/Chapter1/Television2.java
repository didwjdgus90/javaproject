package Chapter1;

public class Television2 {
	int channel;
	int volume;
	boolean onOff;
	void print(){
		System.out.println("ä����"+channel+"�̰� ������"+volume+"�Դϴ�.");
	}
	int getChannel(){
		return channel;
	}
	void setChannel(int ch){
		channel = ch;
	}
}
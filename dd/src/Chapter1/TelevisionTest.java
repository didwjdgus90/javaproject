package Chapter1;

public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel  = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		myTv.print();
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();
		System.out.println("���� �ڷ������� ä����"+myTv.channel+"�̰� ������"+myTv.volume+"�Դϴ�.");
		System.out.println("���� �ڷ������� ä����"+yourTv.channel+"�̰� ������"+yourTv.volume+"�Դϴ�.");
		
		/*Television myTv= new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel();
		System.out.println("���� ä����"+ch+"�Դϴ�.");*/
	}

}

package Jeong;

public class Library {
	int book;// �������� �ִ� å�� ����
	String kind;// �������� �ִ� å�� ����
	String open;// �������� ������ �ð�
	String ftime;// �������� �ݴ� �ð�
	
	void print () {
		System.out.println("�������� ������ �ð���"+open+"������ �ð���"+ftime+"�Դϴ�."+"\n������ å�� ������ "+book+"�� �Դϴ�."+"\nå�� ������"+kind+"���� �ֽ��ϴ�.");
	}
	
}
class Borrow{
	String id;//����
	
	void print3(){
		System.out.println("������ ���� :"+id+"�� �������ž� �մϴ�.");
	}
}
class User{
	int month;//���� ���� ��
	int day;// ���� ���� ��
	int year;// ���� ���� ��
	String bre;//���� �ݳ��ؾߵǴ�  ��¥
	String ubookn;// ���� ���� å�� �̸�
	String ubookk;// ���� ���� å�� ����
	
	
	void print1(){
		System.out.println("�̿���"+"\n���� ���� �ð�"+year+month+day+"\n���� �ݳ��ؾߵǴ� ��¥ "+bre+"�ȿ� ���� �ؾߵ˴ϴ�."+"\n���� å�� �̸� :"+ubookn+"\n���� å�� ���� :"+ubookk);
	}
	
}
class Manager{
	int year1;//���� ��
	int day1;//���� ��
	int month1;//���� �� 
	int ryear;// �ݳ� �ؾߵǴ� ��
	int rday;// �ݳ� �ؾߵǴ� ��
	int rmonth;// �ݳ� �ؾߵǴ� ��
	String bookn;// �̿��ڰ� ���� å�� �̸�
	String name;// �̿����� �̸�
	String bookk;// �̿��ڰ� ���� å�� ����
	String number;// �̿����� ����
	
	void print2(){
		System.out.println("������"+"\n���� ��¥ :"+year1+month1+day1+"\n�ݳ� �ؾߵǴ� ��¥ :"+ryear+rday+rmonth+"\n���� å�� �̸� :"+bookn+"\n���� å�� ���� :"+bookk+"\n���� ����� �̸�:"+name+"\n���� ����� ��ȭ��ȣ :"+number);
	}
}



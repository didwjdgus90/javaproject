package MyFrame;

import java.sql.*;

public class ConnectDatabase {
	public static Connection makeConnection(){
		String URL = "jdbc:mysql://localhost/test?serverTimezone=UTC";
		String ID = "root";
		String PASSWORD = "1234";
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(URL,ID,PASSWORD);
			System.out.println("�����ͺ��̽� ���� ����");
		}catch(ClassNotFoundException e){
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		}catch(SQLException e){
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}
		
		return con;
	}
}

package Udptest;

import java.io.IOException;
import java.net.InetAddress;

import org.omg.CORBA.portable.UnknownException;

public class host2ip {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String hostname = "www.daum.net";
		try
		{
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP �ּ� :" + address.getHostAddress());
		}
		catch(UnknownException e)
		{
			System.out.println(hostname + "�� IP �ּҸ� ã�� �� �����ϴ�.");
		}

	}

}

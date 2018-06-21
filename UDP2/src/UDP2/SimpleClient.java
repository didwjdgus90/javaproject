package UDP2;

import java.io.*;
import java.net.*;

public class SimpleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		
		BufferedReader bufferedReader = null;
		BufferedReader bufferedReaderFromServer = null;
		PrintWriter printWriter = null;
		try{
			socket = new Socket("127.0.0.1", 1818);
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			printWriter = new PrintWriter(socket.getOutputStream());
			
			System.out.println("메시지를 입력하시오 :");
			String str = bufferedReader.readLine();
			
			printWriter.println(str);
			printWriter.flush();
			
			bufferedReaderFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String strFromServer = bufferedReaderFromServer.readLine();
			System.out.println("서버로 부터 받은 메시지 :"+strFromServer);
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(bufferedReader != null){
				try{
					bufferedReader.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(bufferedReaderFromServer != null){
				try{
					bufferedReaderFromServer.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
			if(printWriter != null){
				printWriter.close();
			}
			if(socket != null){
				try{
					socket.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}

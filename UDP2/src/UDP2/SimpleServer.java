package UDP2;

import java.io.*;
import java.net.*;

public class SimpleServer {
	public static void main(String[] args){
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try{
			serverSocket = new ServerSocket(1818);	
		} catch (IOException e1){
			e1.printStackTrace();
		}
		
		while (true){
			BufferedReader bufferedReader = null;
			PrintWriter printWriter = null;
			try{
				socket = serverSocket.accept();
				
				bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String str = bufferedReader.readLine();
				System.out.println("Client로 부터 받은 메시지 :" + str);
				
				printWriter = new PrintWriter(socket.getOutputStream());
				
				printWriter.println(str);
				printWriter.flush();
			} catch (IOException e){
				e.printStackTrace();
			} finally{
				if(bufferedReader != null){
					try{
						bufferedReader.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(printWriter != null){
					printWriter.close();
				}
				if(socket != null){
					try{
						socket.close();
					} catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
}

package Udptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Translator extends Thread {
	private Socket socket;
	private int myId;
	public Translator(Socket socket,int clientId){
		this.socket = socket;
		this.myId = clientId;
	}
	public void run(){
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println("안녕하세요? 클라이언트 번호는 "+myId+"입니다.");
			out.println("단어를 입력하세요");
			while(true){
				String input  = in.readLine();
				if(input == null){
					break;
				}
				if(input.equals("YangJeongHyeon") == true){
					out.println("YangJeongHyeon->양정현");
				}else{
					out.println("조금 쉬운 단어를 보내주세요.");
				}
			}
		}catch(IOException e){
			System.out.println("클라이언트 번호 :" + myId + "처리실패"+e);
		}finally{
			try{
				socket.close();
			}catch(IOException e){
				System.out.println("소켓 종료 오류"+e);
			}
			System.out.println("클라이언트 번호:"+myId+"처리 종료");
		}
	}
}

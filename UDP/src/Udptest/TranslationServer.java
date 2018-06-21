package Udptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TranslationServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ������ �������Դϴ�.");
		int clientId = 0;
		ServerSocket ss = new ServerSocket(9101);
		try {
			while (true) {
				clientId++;
				Translator t = new Translator(ss.accept(), clientId);
				t.start();
			}
		} finally {
			ss.close();
		}
	}

	private static class Translator extends Thread {
		private Socket socket;
		private int myId;

		public Translator(Socket socket, int clientId) {
			this.socket = socket;
			this.myId = clientId;
		}

		public void run() {
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println("�ȳ��ϼ���? Ŭ���̾�Ʈ ��ȣ�� " + myId + "�Դϴ�.");
				out.println("�ܾ �Է��ϼ���");
				while (true) {
					String input = in.readLine();
					if (input == null) {
						break;
					}
					if (input.equals("YangJeongHyeon") == true) {
						out.println("YangJeongHyeon->������");
					} else {
						out.println("���� ���� �ܾ �����ּ���.");
					}
				}
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ ��ȣ :" + myId + "ó������" + e);
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
					System.out.println("���� ���� ����" + e);
				}
				System.out.println("Ŭ���̾�Ʈ ��ȣ:" + myId + "ó�� ����");
			}
		}
	}
}
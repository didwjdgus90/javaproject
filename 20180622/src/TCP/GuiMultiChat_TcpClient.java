package TCP;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GuiMultiChat_TcpClient{
	static String nick = null;
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;
	
	public static void main(String args[]) {
		nick = JOptionPane.showInputDialog("당신의 이름");
		FrClient f = new FrClient(nick);
		Socket socket;
		try {
			String serverIp = "127.0.0.1";
			socket = new Socket(serverIp,7777);
			System.out.println("서버에 연결되었습니다.");
			
			Thread receiver = new ClientReceiver(socket);
			receiver.start();
			Thread sender = new ClientSender(socket,nick);
			sender.start();
		}catch(ConnectException e) {
			e.printStackTrace();
		}catch(Exception e) {}
	}
	
	static class ClientSender extends Thread{
		Socket socket;
		String name;
		
		ClientSender(Socket socket, String name){
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			}catch(Exception e) {}
		}
		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if(out!=null) {
					out.writeUTF(name);
				}
				while(out!=null){
					out.writeUTF("["+name+"]"+scanner.nextLine());
				}
			}catch(IOException e) {}
		}
	}
	
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		
		ClientReceiver(Socket socket){
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
			}catch(IOException e) {}
		}
		public void run() {
			while(in!=null) {
				try {
					String s = in.readUTF();
					System.out.println(s);
					ta.append(s+"\n");
				}catch(IOException e) {}
			}
		}
	}
	
	
	@SuppressWarnings("serial")
	static class FrClient extends JFrame implements ActionListener{
		
		public FrClient(String nick) {
			setSize(600,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle(nick+"클라이언트");
			setLayout(new BorderLayout());
			
			JLabel label = new JLabel("This is a server!");
			ta = new JTextArea(25,40);
			tf = new JTextField(25);
			tf.addActionListener(this);
			
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			
			JLabel label_name = new JLabel(nick+"님");
			panel.add(label_name,BorderLayout.WEST);
			panel.add(tf,BorderLayout.CENTER);
			
			add(label,BorderLayout.NORTH);
			add(ta,BorderLayout.CENTER);
			add(panel,BorderLayout.SOUTH);
			
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==tf) {
				try {
					out.writeUTF(nick+":"+tf.getText());
					tf.setText("");
				} catch(IOException e1) {}
			}
		}
	}
}

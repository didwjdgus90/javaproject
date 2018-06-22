package TCP;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GuiMultiChat_TcpClient extends JFrame implements ActionListener {
	private BufferedReader in;
	private PrintWriter out;
	private JTextField field;
	private JTextArea area;
	
	JTextArea ta;
	JTextField tf;

	public GuiMultiChat_TcpClient() throws Exception, IOException {
		setBounds(300,100,600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("클라이언트");
		
		JLabel label = new JLabel("This is a Chat Server!!");
		ta = new JTextArea(25, 40);
		tf = new JTextField(25);
		
		add (label, BorderLayout.NORTH);
		add (ta, BorderLayout.CENTER);
		add (tf, BorderLayout.SOUTH);
		
		setVisible(true);;
		Socket socket = new Socket("localhost", 8888);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		area.append(in.readLine() + "\n");
		area.append(in.readLine() + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		out.println(field.getText());
		String response = null;
		try {
			response = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		area.append(response + "\n");
	}

	public static void main(String[] args) throws Exception {
		GuiMultiChat_TcpClient f = new GuiMultiChat_TcpClient();
	}

}

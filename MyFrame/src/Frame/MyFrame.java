package Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class MyFrame extends JFrame {
	
	public MyFrame(){
		setSize(800,240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		String Cloum [] = {"�̸�","����","����","����"};
		String data [] = {"������","30","30","30"};
		DefaultTableModel defaultTableModel = new DefaultTableModel(data,Cloum);
		JTable table = new JTable(defaultTableModel);
		JScroll
		table.setBounds(370, 0, 500, 200);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		

		
		Button button = new Button("�̸�");
		button.setBounds(0,0,100,50);
		Button button2 = new Button("����");
		button2.setBounds(0,50,100,50);
		Button button3 = new Button("����");
		button3.setBounds(0,100,100,50);
		Button button4 = new Button("����");
		button4.setBounds(0,150,100,50);
		
		JTextField text = new JTextField();
		text.setBounds(100,0, 150, 50);
		JTextField text2 = new JTextField();
		text2.setBounds(100,50,150,50);
		JTextField text3 = new JTextField();
		text3.setBounds(100,100,150,50);
		JTextField text4 = new JTextField();
		text4.setBounds(100, 150,150,50);
		
		JButton b1 = new JButton("�߰�");
		b1.setBounds(250,0,100,50);
		JButton b2 = new JButton("����");
		b2.setBounds(250,50,100,50);
		JButton b3 = new JButton("����");
		b3.setBounds(250,100,100,50);
			
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(text);
		panel.add(text2);
		panel.add(text3);
		panel.add(text4);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(table);
		add(panel);
		setVisible(true);
	}
	
}

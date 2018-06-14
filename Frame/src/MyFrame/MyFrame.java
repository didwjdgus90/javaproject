package MyFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
	
	public MyFrame(){
		setSize(820,240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel2 = new JPanel();
		String Cloum [] = {"이름","국어","영어","수학"};
		String data [][] = {{"양정현","30","30","30"}};
		panel2.setLayout(new BorderLayout());
		DefaultTableModel defaultTableModel = new DefaultTableModel(data,Cloum);
		JTable table = new JTable(defaultTableModel);
		JScrollPane scrooll = new JScrollPane(table);
		panel2.add(scrooll,"West");
		panel2.setBounds(350, 0, 500, 200);
		this.setLayout(null);
		
		
		Button button = new Button("이름");
		button.setBounds(0,0,100,50);
		Button button2 = new Button("국어");
		button2.setBounds(0,50,100,50);
		Button button3 = new Button("영어");
		button3.setBounds(0,100,100,50);
		Button button4 = new Button("수학");
		button4.setBounds(0,150,100,50);
		
		JTextField text = new JTextField();
		text.setBounds(100,0, 150, 50);
		JTextField text2 = new JTextField();
		text2.setBounds(100,50,150,50);
		JTextField text3 = new JTextField();
		text3.setBounds(100,100,150,50);
		JTextField text4 = new JTextField();
		text4.setBounds(100, 150,150,50);
		
		JButton b1 = new JButton("추가");
		b1.setBounds(250,0,100,50);
		b1.addActionListener((ActionListener)new AddActionListener(table,text,text2,text3,text4));
		JButton b2 = new JButton("제거");
		b2.setBounds(250,50,100,50);
		b2.addActionListener((ActionListener)new RemoveActionListener(table));
		JButton b3 = new JButton("수정");
		b3.setBounds(250,100,100,50);
		b3.addActionListener((ActionListener)new UpdateActionListener(table,text,text2,text3,text4));	
		add(button);
		add(button2);
		add(button3);
		add(button4);
		add(text);
		add(text2);
		add(text3);
		add(text4);
		add(b1);
		add(b2);
		add(b3);
		add(panel2);
		setVisible(true);
	}
	
}
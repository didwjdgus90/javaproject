package MyFrame;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import javax.xml.soap.Text;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame  {
	DAO DAO = new DAO();
	DTO DTO = new DTO();

	JTextField jtName, jtKor, jtEng, jtMat;
	JButton jbAdd, jbDel, jbChange;
	JTable table;

	public MyFrame() {
		setSize(820, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");

		DAO = new DAO();

		JPanel panel2 = new JPanel();
		String Cloum[] = { "�̸�", "����", "����", "����" };
		panel2.setLayout(new BorderLayout());
		DefaultTableModel defaultTableModel = new DefaultTableModel(null, Cloum);
		JTable table = new JTable(defaultTableModel);
		JScrollPane scrooll = new JScrollPane(table);
		panel2.add(scrooll, "West");
		panel2.setBounds(350, 0, 500, 200);
		this.setLayout(null);

		Button button = new Button("�̸�");
		button.setBounds(0, 0, 100, 50);
		Button button2 = new Button("����");
		button2.setBounds(0, 50, 100, 50);
		Button button3 = new Button("����");
		button3.setBounds(0, 100, 100, 50);
		Button button4 = new Button("����");
		button4.setBounds(0, 150, 100, 50);

		JTextField jtName = new JTextField();
		jtName.setBounds(100, 0, 150, 50);
		JTextField jtKor = new JTextField();
		jtKor.setBounds(100, 50, 150, 50);
		JTextField jtEng = new JTextField();
		jtEng.setBounds(100, 100, 150, 50);
		JTextField jtMat = new JTextField();
		jtMat.setBounds(100, 150, 150, 50);

		JButton b1 = new JButton("�߰�");
		b1.setBounds(250, 0, 100, 50);
		b1.addActionListener(new AddActionListener(table,jtName,jtKor,jtEng,jtMat));
		JButton b2 = new JButton("����");
		b2.setBounds(250, 50, 100, 50);
		b2.addActionListener(new RemoveActionListener(table));
		JButton b3 = new JButton("����");
		b3.setBounds(250, 100, 100, 50);
		

		add(button);
		add(button2);
		add(button3);
		add(button4);
		add(jtName);
		add(jtKor);
		add(jtEng);
		add(jtMat);
		add(b1);
		add(b2);
		add(b3);
		add(panel2);
		setVisible(true);
	}
}


	
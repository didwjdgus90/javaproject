package Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class MyFrame extends JFrame {
	
	public MyFrame(){
		setSize(860,300);
		setTitle("���� �������α׷�");
		
		JPanel panelText = new JPanel();
		panelText.setLayout(null);
		
		//table
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		
		String colum [] = {"�̸�","��������","��������","��������","����","���"};
		DefaultTableModel model = new DefaultTableModel(colum,0);
		JTable table = new JTable(model);
		JScrollPane jsp = new JScrollPane(table);
		
		
		panel2.setBounds(380,5,500, 250);
		panel2.add(jsp,"West");
		
		//�̸�,����
		Button button = new Button("�̸�");
		button.setBounds(5,5,100,50);
		
		Button button2 = new Button("��������");
		button2.setBounds(5,60,100,50);
		
		Button button3 = new Button("��������");
		button3.setBounds(5,115,100,50);
		
		Button button4 = new Button("��������");
		button4.setBounds(5,170,100,50);
		
		panelText.add(button);
		panelText.add(button2);
		panelText.add(button3);
		panelText.add(button4);
		
		
		//�ؽ�Ʈ
		JTextField text = new JTextField();
		text.setBounds(110,5,150,50);
		JTextField text2 = new JTextField();
		text2.setBounds(110,60,150,50);
		JTextField text3  = new JTextField();
		text3.setBounds(110,115,150,50);
		JTextField text4  = new JTextField();
		text4.setBounds(110,170,150,50);
		
		panelText.add(text);
		panelText.add(text2);
		panelText.add(text3);
		panelText.add(text4);
		
		
		//�߰�,����, ���� ��ư
		JButton b1 = new JButton("�߰�");
		b1.setBounds(265,5,100, 50);
		b1.addActionListener(new AddActionListener(table,text,text2,text3,text4));
		JButton b2 = new JButton("����");
		b2.setBounds(265,60,100,50);
		b2.addActionListener(new DelActionListener(table));
		JButton b3 = new JButton("����");
		b3.setBounds(265,115,100,50);
		
		panelText.add(b1);
		panelText.add(b2);
		panelText.add(b3);
		
	
		
		add(panel2);
		add(panelText);
		setVisible(true);
	}
	
}

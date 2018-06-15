package Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class MyFrame extends JFrame {
	
	public MyFrame(){
		setSize(860,300);
		setTitle("성적 관리프로그램");
		
		JPanel panelText = new JPanel();
		panelText.setLayout(null);
		
		//table
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		
		String colum [] = {"이름","국어점수","영어점수","수학점수","총점","평균"};
		DefaultTableModel model = new DefaultTableModel(colum,0);
		JTable table = new JTable(model);
		JScrollPane jsp = new JScrollPane(table);
		
		
		panel2.setBounds(380,5,500, 250);
		panel2.add(jsp,"West");
		
		//이름,과목
		Button button = new Button("이름");
		button.setBounds(5,5,100,50);
		
		Button button2 = new Button("국어점수");
		button2.setBounds(5,60,100,50);
		
		Button button3 = new Button("영어점수");
		button3.setBounds(5,115,100,50);
		
		Button button4 = new Button("수학점수");
		button4.setBounds(5,170,100,50);
		
		panelText.add(button);
		panelText.add(button2);
		panelText.add(button3);
		panelText.add(button4);
		
		
		//텍스트
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
		
		
		//추가,제거, 삭제 버튼
		JButton b1 = new JButton("추가");
		b1.setBounds(265,5,100, 50);
		b1.addActionListener(new AddActionListener(table,text,text2,text3,text4));
		JButton b2 = new JButton("제거");
		b2.setBounds(265,60,100,50);
		b2.addActionListener(new DelActionListener(table));
		JButton b3 = new JButton("수정");
		b3.setBounds(265,115,100,50);
		
		panelText.add(b1);
		panelText.add(b2);
		panelText.add(b3);
		
	
		
		add(panel2);
		add(panelText);
		setVisible(true);
	}
	
}

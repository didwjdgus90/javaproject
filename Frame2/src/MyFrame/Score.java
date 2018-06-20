package MyFrame;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import javax.xml.soap.Text;

import java.sql.*;
import java.util.Vector;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Score extends JFrame  {
	DAO A = new DAO();
	DTO T = new DTO();

	JTextField tname, tkor, teng, tmat;
	JButton b1, b2, b3;
	JTable table;
	Vector col;

	public Score() {
		setSize(820, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");

		DAO A = new DAO();

		A.getConn();
		col = new Vector();
		col.add("이름");
		col.add("국어");
		col.add("영어");
		col.add("수학");
		col.add("총점");
		col.add("평균");

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		DefaultTableModel defaultTableModel = new DefaultTableModel(A.getScore(), col);
		JTable table = new JTable(defaultTableModel);
		JScrollPane scrooll = new JScrollPane(table);
		panel2.add(scrooll, "West");
		panel2.setBounds(350, 0, 500, 200);
		this.setLayout(null);

		Button button = new Button("이름");
		button.setBounds(0, 0, 100, 50);
		Button button2 = new Button("국어");
		button2.setBounds(0, 50, 100, 50);
		Button button3 = new Button("영어");
		button3.setBounds(0, 100, 100, 50);
		Button button4 = new Button("수학");
		button4.setBounds(0, 150, 100, 50);

		JTextField tname = new JTextField();
		tname.setBounds(100, 0, 150, 50);
		JTextField tkor = new JTextField();
		tkor.setBounds(100, 50, 150, 50);
		JTextField teng = new JTextField();
		teng.setBounds(100, 100, 150, 50);
		JTextField tmat = new JTextField();
		tmat.setBounds(100, 150, 150, 50);

		JButton b1 = new JButton("추가");
		b1.setBounds(250, 0, 100, 50);
		b1.addActionListener(add);
		JButton b2 = new JButton("제거");
		b2.setBounds(250, 50, 100, 50);
		b2.addActionListener(del);
		JButton b3 = new JButton("수정");
		b3.setBounds(250, 100, 100, 50);
		b3.addActionListener(up);

		add(button);
		add(button2);
		add(button3);
		add(button4);
		add(tname);
		add(tkor);
		add(teng);
		add(tmat);
		add(b1);
		add(b2);
		add(b3);
		add(panel2);
		setVisible(true);
	}

	ActionListener add = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			contentSet();
			int result = A.insertScore(T);
			if (result == 1) {
				jTableRefresh();
				contentClear();
			}
		}

	};
	ActionListener del = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			contentSet();
			int result = A.deleteScore(T);
			if (result == 1) {
				jTableRefresh();
				contentClear();
			}
		}

	};
	ActionListener up = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			contentSet();
			int result = A.updateScore(T);
			if (result == 1) {
				jTableRefresh();
				contentClear();
			}
		}

	};
	public void jTableRefresh() {
		DefaultTableModel model = new DefaultTableModel(A.getScore(), col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
	}

	public void contentSet() {
		DTO D = new DTO();

		int kor, eng, mat, tot, ave;
		String name = tname.getText();

		kor = Integer.parseInt(tkor.getText());
		eng = Integer.parseInt(teng.getText());
		mat = Integer.parseInt(tmat.getText());
		tot = kor + eng + mat;
		ave = tot / 3;

		D.setName(name);
		D.setKor(kor);
		D.setEng(eng);
		D.setMat(mat);
		D.setTot(tot);
		D.setAve(ave);

	}

	public void contentClear(){
		tname.setText("");
		tkor.setText("");
		teng.setText("");
		tmat.setText("");
	}

}

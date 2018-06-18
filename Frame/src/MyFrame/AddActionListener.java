package MyFrame;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class AddActionListener implements ActionListener {
	
	   scoreDTO = new ScoreDTO();
	     
	    String name = jtName.getText();
	    if (name.equals("") || name.equals(null)) JOptionPane.showMessageDialog(this, "이름을 입력하세요!");
	     
	    int kor, eng, mat, tot, ave;
	     
	    if (jtKor.getText().equals("") || jtKor.getText().equals(null)) {
	      kor = 0;
	    } else {
	      kor = Integer.parseInt(jtKor.getText());
	    } // if
	    if (jtEng.getText().equals("") || jtEng.getText().equals(null)) {
	      eng = 0;
	    } else {
	      eng = Integer.parseInt(jtEng.getText());
	    } // if
	    if (jtMat.getText().equals("") || jtMat.getText().equals(null)) {
	      mat = 0;
	    } else {
	      mat = Integer.parseInt(jtMat.getText());
	    } // if
	   
	 

		DefaultTableModel model = (DefaultTableModel)table.getModel();
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 tot = kor + eng + mat;
			 ave = tot / 3;
	     
			 DTO.setName(name);
			 DTO.setKor(kor);
			 DTO.setEng(eng);
			 DTO.setMat(mat);
			 DTO.setTot(tot);
			 DTO.setAve(ave);
		}
		model.addRow(arr);
	}
}

package Frame;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class AddActionListener implements ActionListener {
	JTable table;
	JTextField text,text2,text3,text4;
	
	AddActionListener(JTable table,JTextField text,JTextField text2,JTextField text3,JTextField text4){
		this.table = table;
		this.text  = text;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String arr[] = new String[4];
		arr[0]=text.getText();
		arr[1]=text2.getText();
		arr[2]=text3.getText();
		arr[3]=text4.getText();
		
		
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(arr);
	}
}

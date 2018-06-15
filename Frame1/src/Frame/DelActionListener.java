package Frame;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class DelActionListener implements ActionListener {
	JTable table;

	DelActionListener(JTable table) {
		 this.table = table;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int row = table.getSelectedRow();//클릭 했을때
		if(row==-1){
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);
	}
}	

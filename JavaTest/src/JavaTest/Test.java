package JavaTest;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import javax.swing.JFrame;

public class Test {
	
	JFrame frame = new JFrame ("메모장");
	
	JTextArea text = new JTextArea(5,10);
	
	JScrollPane jp = new JScrollPane(text);
	
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("file");
	JMenu help = new JMenu("help");

	
	public  Test(){
		file.add(new JMenuItem("새 파일"));
		file.getItem(0).setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK));
		file.add(new JMenuItem("열기"));
		file.add(new JMenuItem("저장"));
		file.addSeparator();
		file.add(new JMenuItem("종료"));
		
		help.add(new JMenuItem("버전"));
		help.add(new JMenuItem("정보"));
		
		menuBar.add(file);
		menuBar.add(help);
		
		frame.setJMenuBar(menuBar);
		
		frame.add(jp,"Center");
		
		frame.setSize(500,500);
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new Test();
	}

}

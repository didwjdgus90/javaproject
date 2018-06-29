
import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;

//�ҽ��� �Է��ϰ� Ctrl+Shift+0�� ������ �ʿ��� ������ �����Ѵ�.
public class TicTacToeClient extends Thread {
	private JButton[][] buttons = new JButton[3][3]; // ��ư���� �迭�� ���带 ǥ���Ѵ�.
	private char other;
	private char me; // ���� ���ڿ� ���� ���ڸ� ���⿡ �����Ѵ�.
	private JFrame frame;// ������ ��ü
	private JPanel panel;// �гΰ�ü, ���⿡ ���尡 ��������.
	private JLabel message;// �����κ��� ���� �޽����� �����ִ� ���̺��̴�.
	private Socket socket;// ������ ����� ����
	private BufferedReader input;// �Է½�Ʈ��
	private PrintWriter output;// ��½�Ʈ��

	public TicTacToeClient() throws UnknownHostException, IOException {

		socket = new Socket("localhost", 9001);// ����� ���� ��ǻ�Ϳ����� ����

		// �������κ��� �Է½�Ʈ���� ��� ��Ʈ���� ���Ѵ�.
		input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		output = new PrintWriter(socket.getOutputStream(), true);

		// ���ø����̼��� GUI�� �����Ѵ�. 9���� Lab�� �����ϴ�.
		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		Font font = new Font("Dialog", Font.ITALIC, 50);

		message = new JLabel("���⿡ �޽����� ǥ�õ˴ϴ�.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(message, BorderLayout.SOUTH);
		frame.setSize(300, 300);
		frame.setVisible(true);

		// �гο� 3x3 ���� �������� ��ư�� �߰��Ѵ�.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				final int ii = i;
				final int jj = j;
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(font);
				// �� ��ư�� �̺�Ʈ ó���⸦ ���δ�. ���ٽ��� ����Ͽ���.
				buttons[i][j].addActionListener(e -> {
					buttons[ii][jj].setText("" + me);
					output.println("MOVE " + ii + " " + jj);
				});
				panel.add(buttons[i][j]);
			}
		}
		panel.repaint();
	}

	// ������ Ŭ�������� �۾��� ����ϴ� �޼ҵ��̴�.
	public void run() {
		String response;
		try {
			response = input.readLine(); // �����κ��� ù��° ��ɾ �д´�.

			if (response.startsWith("START")) { // START ��ɾ��̸� ��⸦ �����Ѵ�.
				me = response.charAt(6);
				other = (me == 'X') ? 'O' : 'X';
				message.setText("��Ⱑ ���۵˴ϴ�.");
				frame.setTitle("���� ����ڴ� " + me);
			}
			// �����κ��� �ݺ������� ��ɾ �о ó���Ѵ�.
			while (true) {
				response = input.readLine();
				if (response.startsWith("OTHER")) { // ������ ���� ���忡 ǥ���Ѵ�.
					int i = Integer.parseInt(response.substring(6, 7));
					int j = Integer.parseInt(response.substring(8, 9));
					buttons[i][j].setText("" + other);
					message.setText("������ �ξ����ϴ�. ");
				} else if (response.startsWith("PRINT")) { // �޽����� ȭ�鿡 ����Ѵ�.
					message.setText(response.substring(6));
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		TicTacToeClient client = new TicTacToeClient();
		client.start();
	}
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Run {

	public static void main(String[] args) {
		createWindow();

	}
	public static void createWindow() {
		JFrame frame = new JFrame("Start");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button1 = new JButton("Start");
		button1.setBounds(100,100,100,100);
		JButton button2 = new JButton("Stop");
		button2.setBounds(100,100,200,100);
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}

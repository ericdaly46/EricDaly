import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
public class GUI {

	public static void main(String[] args) {
		//JFrame frame = new JFrame("Game");
		//frame.setSize(500,500);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		///JButton button1 = new JButton("Press");
		//frame.getContentPane().add(button1);
		//frame.setVisible(true);
	}
	public static void createWindow() {
		JFrame frame = new JFrame("Game");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button1 = new JButton("Press");
		frame.getContentPane().add(button1);
		frame.setVisible(true);
	}
}

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI {
	private JFrame frame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	   
	public static void main(String[] args) {
		
}
	//Create Game UI with a background image
	public void prepareGame() {
		frame = new JFrame("Game Window");
	      frame.setSize(1000,1000);
	      frame.setLayout(new GridLayout(3, 1));
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      headerLabel = new JLabel("", JLabel.CENTER);
	      statusLabel = new JLabel("",JLabel.CENTER);
	      statusLabel.setBounds(100,100,200,200);
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());
	      frame.add(headerLabel);
	      frame.add(controlPanel);
	      frame.add(statusLabel);
	      try {
	            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\eldaly\\Downloads\\william.jpg")))));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        frame.pack();
	        frame.setVisible(true);
	      frame.setVisible(true);
	   }
	
	  
	   }
	   
	 


	

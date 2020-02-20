import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.*;

public class gameWorld2 {
	private JFrame frame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	public static void main(String[] args) {
		gameWorld2 swingControlDemo = new gameWorld2();
		swingControlDemo.showButtonDemo();

	}
	
	public void prepareGUI() {
		Run window = new Run();
		window.prepareGUI();
	}
	private void showButtonDemo(){
	      JButton okButton = new JButton("Main Screen");
	      okButton.setBounds(200, 200, 150, 150);
	      okButton.addActionListener(new ActionListener() {
	         //When button is pressed close main window and create a game window
	    	  public void actionPerformed(ActionEvent e) {
	    		  System.exit(0);
	    		  prepareGUI();
	           
	    	  }
	    	  
	      });
	      controlPanel.add(okButton);
	      frame.setVisible(true);
	}

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
	            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\eldaly\\Downloads\\xqc.jpg")))));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        frame.pack();
	      frame.setVisible(true);
	   }
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_0) {
			frame.setVisible(false);
		}
		
		if (key == KeyEvent.VK_1) {
			JButton okButton = new JButton("Main Screen");
		      okButton.setBounds(200, 200, 150, 150);
		      okButton.addActionListener(new ActionListener() {
		         //When button is pressed close main window and create a game window
		    	  public void actionPerformed(ActionEvent e) {
		    		  System.exit(0);
		    		  prepareGUI();
		           
		    	  }
		    	  
		      });
		      controlPanel.add(okButton);
		      frame.setVisible(true);
			
		      
		}
	}
	
	
}

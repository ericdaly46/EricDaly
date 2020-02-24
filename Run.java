import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Run {
	private JFrame frame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	  //Makes program work idk
	   public Run() {
		   mainMenu();
	   }
	   
	//Main
	public static void main(String[] args) {
		new Run();

	}
	//Call to prepareGame in GUI
	public void setGame() {
		GUI game = new GUI();
		game.prepareGame();
		
	}
	//Call to gmaeWorld2
	public void setgame2() {
		gameWorld2 game = new gameWorld2();
		game.prepareGame();
	}
	public static void gameWorld()
    {
        JFrame obj = new JFrame("Banking Software");
        JButton b1 = new JButton("Opening Account");
        JLabel image = new JLabel(new ImageIcon("C:\\Users\\eldaly\\Downloads\\canes.jpg"));
        image.setBounds(0,0, 1600, 1400);
        obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
        obj.add(image);
        b1.setBounds(500,400, 200, 20);
        image.add(b1);
        
        obj.setVisible(true);
    }
	
	//Create a new JFrame and stlye it
	public void prepareGUI(){
	      frame = new JFrame("Main Window");
	      frame.setSize(500,500);
	      frame.setLayout(new GridLayout(3, 1));
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      headerLabel = new JLabel("", JLabel.CENTER);
	      statusLabel = new JLabel("",JLabel.CENTER);
	      statusLabel.setBounds(100,100,200,200);
	      controlPanel = new JPanel();
	      frame.add(headerLabel);
	      frame.add(controlPanel);
	      frame.add(statusLabel);
	      
	      /**
	      try {
	            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\eldaly\\Downloads\\canes.jpg")))));
	        } catch (IOException e) {
	            e.printStackTrace();
	       }
	       **/
	     
	      //frame.pack();
	      
	   }
	
	
	
	//Display a button on the JFrame with a listener
	 private void showButtonDemo(){
		
		 //try {
	            //frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\eldaly\\Downloads\\canes.jpg")))));
	      //  } catch (IOException e) {
	           // e.printStackTrace();
	     //  }
		
		 JLabel label = new JLabel();
		 JLabel image = new JLabel(new ImageIcon("C:\\Users\\eldaly\\Downloads\\canes.jpg"));
		 label.setLayout(new FlowLayout());
	      JButton okButton = new JButton("World 1");
	      JButton gameButton = new JButton("World 2");
	      gameButton.setBounds(400, 400, 100, 100);
	      okButton.setBounds(200, 200, 150, 150);
	      okButton.addActionListener(new ActionListener() {
	         //When button is pressed close main window and create a game window
	    	  public void actionPerformed(ActionEvent e) {
	            frame.setVisible(false);
	            setGame();
	    	  }
	      });
	    gameButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		frame.setVisible(false);
	    		setgame2();
	    	}
	    
	           
	            
	            
	         
	      });
	    	label.add(image);
	      label.add(okButton);
	      label.add(gameButton);
	      frame.setVisible(true);
	

}
}
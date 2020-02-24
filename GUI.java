import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI {
	public GUI() {
		mainMenu();
	}
	  
	public static void main(String[] args) {
		new GUI();
}
	
	public void setGame() {
		gameWorld game = new gameWorld();
		game.prepareGame();
		
	}
	public void setGame2() {
		gameWorld2 game = new gameWorld2();
		game.prepareGame2();
	}
	public void mainMenu() 
    {
        JFrame obj = new JFrame("Main Window");
        JButton b1 = new JButton("World 1");
        JButton b2 = new JButton("World 2");
        JLabel image = new JLabel(new ImageIcon("C:\\Users\\eldaly\\Downloads\\canes.jpg"));
        image.setBounds(0,0, 1600, 1400);
        obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
        obj.add(image);
        b1.setBounds(500,200, 100, 40);
        b2.setBounds(1100,200,100,40);
        image.add(b1);
        image.add(b2);
        obj.setVisible(true);
        b1.addActionListener(new ActionListener() {
	         //When button is pressed close main window and create a game window
	    	  public void actionPerformed(ActionEvent e) {

	    		  obj.setVisible(false);
	            setGame();
	    	  }
	      });
        b2.addActionListener(new ActionListener() {
	         //When button is pressed close main window and create a game window
	    	  public void actionPerformed(ActionEvent e) {
	    		  obj.setVisible(false);
	            setGame2();
	    	  }
	      });
        
    }
	
	  
	   }
	   
	 


	

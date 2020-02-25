import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI {
	//Calls mainMenu to use as main
	public GUI() {
		mainMenu();
	}
	 
	public static void main(String[] args) {
		
}
	//Calls to gameWorld to create world1
	public void setGame() {
		gameWorld game = new gameWorld();
		game.prepareGame();
		
	}
	//Calls to gameWorld2 to create world2
	public void setGame2() {
		gameWorld2 game = new gameWorld2();
		game.prepareGame2();
	}
	
	//Creates main frame with an Image and button listener
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
        //Button Listeners
        b1.addActionListener(new ActionListener() {
	         //When button is pressed close main window and create game window1
	    	  public void actionPerformed(ActionEvent e) {

	    		  obj.setVisible(false);
	            setGame();
	    	  }
	      });
        b2.addActionListener(new ActionListener() {
	         //When button is pressed close main window and create game window2
	    	  public void actionPerformed(ActionEvent e) {
	    		  obj.setVisible(false);
	            setGame2();
	    	  }
	      });
        
    }
	
	  
	   }
	   
	 


	

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
public class fakeRun {
 public fakeRun() {
	 mainMenu();
 }
	public static void main(String[] args) {
		new fakeRun();

	}
	public void setGame() {
		GUI game = new GUI();
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
**/
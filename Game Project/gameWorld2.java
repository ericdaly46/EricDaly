
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameWorld2 extends JFrame{
	
	public static void main(String[] args) {
		

	}
	
	
	
	public void setMain() {
		GUI main = new GUI();
		
	}
	//Create Game UI with a background image
	public void prepareGame2() {
		JFrame obj = new JFrame("World 2");
        JButton b3 = new JButton("Main Menu");
        JLabel image = new JLabel(new ImageIcon("C:\\Users\\eldaly\\Downloads\\xqc.jpg"));
        image.setBounds(0,0, 1600, 1400);
        obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
        obj.add(image);
        b3.setBounds(0,0, 100, 40);
        image.add(b3);
        add(new Board());
        obj.setVisible(true);
        b3.addActionListener(new ActionListener() {
	        //When button is pressed close main window and create a game window
	    	  public void actionPerformed(ActionEvent e) {
	    		  obj.setVisible(false);
	            setMain();
	    	  }
	    });
        
	   }
		      
		
	}
	
	

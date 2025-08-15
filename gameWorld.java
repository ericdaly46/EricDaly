
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class gameWorld extends JFrame {
	

	public static void main(String[] args) {
		

	}
	
	
	public void setMain() {
		GUI main = new GUI();
		
	}
	//Create Game UI with a background image
	public void prepareGame() {
		add(new Board());
		setSize(1000, 1000);
        //setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Shooting missiles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

		//JFrame obj = new JFrame("World 1");
       // JButton b3 = new JButton("Main Menu");
       // JLabel image = new JLabel(new ImageIcon("C:\\Users\\eldaly\\Downloads\\william.jpg"));
      //  image.setBounds(0,0, 1600, 1400);
       // obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
       // obj.add(image);
       // b3.setBounds(100,100, 100, 40);
       // add(b3);
      //  setVisible(true);
      //  b3.addActionListener(new ActionListener() {
	        //When button is pressed close main window and create a game window
	   /// 	  public void actionPerformed(ActionEvent e) {
	    //		  setVisible(false);
	   //         setMain();
	    	  }
	 //   });
        
	   }





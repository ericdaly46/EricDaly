import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Char extends Sprite {

	 private int dx;
	    private int dy;
	    private List<Bullet> Bullets;

	    public Char(int x, int y) {
	        super(x, y);
	        
	        initSpaceShip();
	    }

	    private void initSpaceShip() {

	        Bullets = new ArrayList<>();
	        
	        loadImage("C:\\Users\\eldaly\\Downloads\\destiny.png"); 
	        getImageDimensions();
	    }

	    public void move() {
	        x += dx;
	        y += dy;
	    }

	    public List<Bullet> getBullets() {
	        return Bullets;
	    }

	    public void keyPressed(KeyEvent e) {

	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_SPACE) {
	            fire();
	        }

	        if (key == KeyEvent.VK_LEFT) {
	            dx = -10;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            dx = 10;
	        }

	        if (key == KeyEvent.VK_UP) {
	            dy = -10;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            dy = 10;
	        }
	    }

	    public void fire() {
	        Bullets.add(new Bullet(x + width, y + height / 2));
	    }

	    public void keyReleased(KeyEvent e) {

	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	            dx = 0;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            dx = 0;
	        }

	        if (key == KeyEvent.VK_UP) {
	            dy = 0;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            dy = 0;
	        }
	    }
}


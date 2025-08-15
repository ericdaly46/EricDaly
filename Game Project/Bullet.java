
public class Bullet extends Sprite {
	 private final int BOARD_WIDTH = 390;
	    private final int BULLET_SPEED = 2;

	    public Bullet(int x, int y) {
	        super(x, y);
	        
	        initBullet();
	    }
	    
	    private void initBullet() {
	        
	        loadImage("C:\\Users\\eldaly\\Downloads\\william.jpg");  
	        getImageDimensions();
	    }

	    public void move() {
	        
	        x += BULLET_SPEED;
	        
	        if (x > BOARD_WIDTH) {
	            visible = false;
	        }
	    }
}

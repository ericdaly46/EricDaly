import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
public class isKeyPressed {

	 private static volatile boolean wPressed = false;
	    public static boolean isWPressed() {
	        synchronized (isKeyPressed.class) {
	            return wPressed;
	        }
}
	    public static void main(String[] args) {
	        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

	            @Override
	            public boolean dispatchKeyEvent(KeyEvent ke) {
	                synchronized (isKeyPressed.class) {
	                    switch (ke.getID()) {
	                    case KeyEvent.KEY_PRESSED:
	                        if (ke.getKeyCode() == KeyEvent.VK_W) {
	                            wPressed = true;
	                        }
	                        break;

	                    case KeyEvent.KEY_RELEASED:
	                        if (ke.getKeyCode() == KeyEvent.VK_W) {
	                            wPressed = false;
	                        }
	                        break;
	                    }
	                    return false;
	                }
	            }
	        });
}
}
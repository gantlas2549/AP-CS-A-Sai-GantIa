import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * @author Master Sai Gantla
 *
 */
public class MegaAlien extends MovingThing {
	private int speed;
	private Image image;
	
	
	/** constructor
	 * 
	 */
	public MegaAlien() {
		this(0, 0, 100, 100, 0);
	}
	
	/** constructor taking in x,y parameters
	 * @param x is x coordinate
	 * @param y is y coordinate
	 */
	public MegaAlien(int x, int y) {
		super(x,y);
	}

	/** constructor taking in x,y,s parameters
	 * @param x is x  coordinate
	 * @param y is y coordinate
	 * @param s is s coordinate
	 */
	public MegaAlien(int x, int y, int s) {
		super(x,y);
		speed = s;

	}

	/** constructor taking in x,y,w,h,s parameters
	 * @param x is x coordinate
	 * @param y is y coordinate
	 * @param w is width
	 * @param h is height
	 * @param s is size
	 */
	public MegaAlien(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		setSpeed(s);
		try {
			image = ImageIO.read(new File("C:\\Users\\Master Sai Gantla\\Documents\\GitHub\\AP-CS-A-Sai-Gantla\\Unit 17\\src\\dragon.PNG"));
		} catch (Exception e) {
			System.out.println("<thinkingMega>");
		}
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void move(String direction) {
		if (direction.equals("LEFT")) {
			setX(getX() - speed);
		} else if (direction.equals("RIGHT")) {
			setX(getX() + speed);
		}else if (direction.equals("UP")) {
			setY(getY() - speed);
		} else if (direction.equals("DOWN")) {
			setY(getY() + speed);
		}
	}
	
	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}
	
	
	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}

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
	
	
	/** Constructs MegaAlien
	 * 
	 */
	public MegaAlien() {
		this(0, 0, 100, 100, 0);
	}
	
	/** Constructs MegaAlien at x,y
	 * @param x is x coordinate
	 * @param y is y coordinate
	 */
	public MegaAlien(int x, int y) {
		super(x,y);
	}

	/** Constructs MegaAlien at x,y with size s
	 * @param x is x  coordinate
	 * @param y is y coordinate
	 * @param s is size
	 */
	public MegaAlien(int x, int y, int s) {
		super(x,y);
		speed = s;

	}

	/** Constructs MegaAlien at x,y with width w, height h, and size s
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

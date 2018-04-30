//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Master Sai Gantla
 *
 */
public class MegaAlienHorde {
	private List<MegaAlien> aliens;
	private int size;
	private int counter;

	/** constructor with s parameter
	 * @param s is size
	 */
	public MegaAlienHorde(int s) {
		aliens = new ArrayList<MegaAlien>();
		size = s;
	}

	/** adds aliens to horde
	 * @param alien is individual alien
	 */
	public void add(MegaAlien alien) {
		aliens.add(alien);
	}

	/** draws aliens
	 * @param window is the graphics window
	 */
	public void drawEmAll(Graphics window) {
		for (MegaAlien alien : aliens)
			alien.draw(window);
	}
	
	/** moves all of the aliens in the horde
	 * 
	 */
	public void moveEmAll() {
		counter++; 
		for (MegaAlien alien : aliens) {
			if (counter <= 220)
				alien.move("RIGHT");
			else if (counter <= 300)
				alien.move("DOWN");
			else if (counter <= 520)
				alien.move("LEFT");
			else if (counter <= 600)
				alien.move("UP");
			else if (counter <= 750)
				counter = 0;
		}
	}

	/** removes all the dead aliens
	 * @param shots is the shots taken
	 */
	public void removeDeadOnes(List<Ammo> shots) {
		for (int i = 0; i < shots.size(); i++)
			for (int j = 0; j < aliens.size(); j++)
				try { 
					if (shots.get(i).Collide(aliens.get(j))) {
						shots.remove(i);
						aliens.remove(j);
						size--;
					}
				} catch (Exception e) {
					System.out.println(aliens.size() + " aliens left");
				}
	}

	/** checks to see if ship has been killed
	 * @param ship is the ship
	 */
	public void checkShipDeath(Ship ship) {
		for (int i = 0; i < aliens.size(); i++)
			if (ship.Collide(aliens.get(i))) {
				System.out.println("L");
				System.exit(0);
			}
	}

	/** gets size of horde
	 * @return
	 */
	public int getSize() {
		return size;
	}

	public String toString() {
		return "";
	}
}
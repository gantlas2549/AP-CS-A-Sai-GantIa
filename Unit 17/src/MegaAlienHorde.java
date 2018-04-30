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

	/** Constructs horde of size s
	 * @param s is size
	 */
	public MegaAlienHorde(int s) {
		aliens = new ArrayList<MegaAlien>();
		size = s;
	}

	/** Adds aliens to horde
	 * @param alien is individual alien
	 */
	public void add(MegaAlien alien) {
		aliens.add(alien);
	}

	/** Draws aliens in window
	 * @param window is the graphics window
	 */
	public void drawEmAll(Graphics window) {
		for (MegaAlien alien : aliens)
			alien.draw(window);
	}
	
	/** Moves all of the aliens in the horde
	 * 
	 */
	public void moveEmAll() {
		counter++; 
		for (MegaAlien alien : aliens) {
			if (counter <= 180) {
				alien.setSpeed(2);
				alien.move("RIGHT"); }
			else if (counter <= 250) {
				alien.setSpeed(4);
				alien.move("DOWN"); }
			else if (counter <= 400 ) {
				alien.setSpeed(2);
				alien.move("LEFT"); }
			else if (counter <= 500) {
				alien.setSpeed(3);
				alien.move("UP"); }
			else if (counter <= 640) {
				counter = 0; }
		}
	}

	/** Removes all the dead aliens, as specified by the shots made
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

	/** Checks to see if ship has been killed
	 * @param ship is the ship
	 */
	public void checkShipDeath(Ship ship) {
		for (int i = 0; i < aliens.size(); i++)
			if (ship.Collide(aliens.get(i))) {
				System.out.println("L");
				System.exit(0);
			}
	}

	/** Gets size of horde
	 * @return size of horde
	 */
	public int getSize() {
		return size;
	}

	public String toString() {
		return "";
	}
}
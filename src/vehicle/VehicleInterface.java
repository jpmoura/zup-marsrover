/**
 * 
 */
package vehicle;

/**
 * Interface for all vehicle classes
 * @author Joao Pedro Santos de Moura
 */
public interface VehicleInterface {
	
	/**
	 * Get the X coordinate
	 * @return The current X coordinate
	 */
	public int getX();
	
	/**
	 * Set the new X coordinate
	 * @param x New X coordinate
	 */
	public void setX(int x);
	
	/**
	 * Get the Y coordinate
	 * @return The current Y coordinate
	 */
	public int getY();
	
	/**
	 * Set a new Y coordinate
	 * @param y The new Y coordinate
	 */
	public void setY(int y);
	
	/**
	 * Get the cardinal point that vehicle is facing.
	 * @return The heading direction.
	 */
	public int getHeading();
	
	/**
	 * Set a new heading direction.
	 */
	public void setHeading(char x);
	
	public boolean move();
	
	public boolean execute(String commands);

}

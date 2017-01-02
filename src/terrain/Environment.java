package terrain;

public interface Environment {
	
	/**
	 * Get the minimum value of the X coordinate
	 * @return Minimum X coordinate of the terrain
	 */
	public int getMinimumX();
	
	/**
	 * Get the minimum value of the Y coordinate
	 * @return Minimum Y coordinate of the terrain
	 */
	public int getMinimumY();
	
	/**
	 * Get the maximum value of the X coordinate
	 * @return Maximum X coordinate of the terrain
	 */
	public int getMaximumX();
	
	/**
	 * Get the maximum value of the Y coordinate
	 * @return Minimum Y coordinate of the terrain
	 */
	public int getMaximumY();
}

package vehicle;
import terrain.*;

/**
 * Implementation of a rover vehicle.
 * @author Joao Pedro Santos de Moura
 */
public class Rover extends Vehicle {
		
	/**
	 * Constructor with default values of x and y, heading and environment
	 */
	public Rover() {
		super();
	}

	/**
	 * Constructor with specific values of x and y
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @param heading Cardinal point witch the rover is facing
	 */
	public Rover(int x, int y, char heading, Environment environment) {
		super(x, y, heading, environment);
	}
}

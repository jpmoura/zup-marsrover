package vehicle;
import terrain.*;

public class Rover {
	
	private int x, y;
	private char heading;
	private Environment environment;
		
	/**
	 * Constructor with default values of x and y, heading and environment
	 */
	public Rover() {
		this.x = 0;
		this.y = 0;
		this.heading = 'N';
		this.environment = new Plateau();
	}

	/**
	 * Constructor with specific values of x and y
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @param heading Cardinal point witch the rover is facing
	 */
	public Rover(int x, int y, char heading, Environment environment) {
		this.x = x;
		this.y = y;
		this.heading = heading;
		this.environment = environment;
	}
	
	/**
	 * Get the X coordinate
	 * @return The current X coordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Set the new X coordinate
	 * @param x New X coordinate
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Get the Y coordinate
	 * @return The current Y coordinate
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Set a new Y coordinate
	 * @param y The new Y coordinate
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Rotate the rover to face a new cardinal point.
	 * @param direction Must be L (Left) or R (Right) 
	 */
	private void rotate(char direction) {
		if(direction == 'L')
		{
			switch (this.heading)
			{
				case 'N':
					this.heading = 'W';
					break;
				case 'E':
					this.heading = 'N';
					break;
				case 'S':
					this.heading = 'E';
					break;
				case 'W':
					this.heading = 'S';
					break;
			}
		}
		else 
		{ // direction == 'R'
			switch (this.heading)
			{
				case 'N':
					this.heading = 'E';
					break;
				case 'E':
					this.heading = 'S';
					break;
				case 'S':
					this.heading = 'W';
					break;
				case 'W':
					this.heading = 'N';
					break;
			}
		}
	}
	
	/**
	 * Move the rover according to its heading position.
	 * @return True if the movement was executed, False otherwise.
	 */
	private boolean move() {
		boolean isSuccessful = true;
		
		switch (this.heading)
		{
			case 'N':
				if(this.y < this.environment.getMaximumY())
					++this.y;
				else isSuccessful = false;
				break;
			case 'E':
				if (this.x < this.environment.getMaximumX())
					++this.x;
				else isSuccessful = false;
				break;
			case 'S':
				if (this.environment.getMinimumY() < this.y)
					--this.y;
				else isSuccessful = false;
				break;
			case 'W':
				if (this.environment.getMinimumX() < this.x)
					--this.x;
				else isSuccessful = false;
				break;
		}
		
		return isSuccessful;
	}
	
	@Override
	public String toString() {
		return x + " "+ y + " " + heading;
	}

	/**
	 * Execute a command sequence
	 * @param commands Array of characters that contains the all the sequential commands.
	 * @return True if the string is valid and it was executed or false otherwise.
	 */
	public boolean execute(String commands) {
		commands = commands.toUpperCase();
		
		for (int index = 0; index < commands.length(); ++index) {
			char command = commands.charAt(index);
			
			if (command == 'L' || command == 'R') this.rotate(command);
			else if (command == 'M') this.move();
			else return false;
		}
		
		return true;
	}
}

package terrain;
/**
 * This class represents the environment where the a rover can be placed.
 * @author Joao Pedro Santos de Moura
 */
public class Plateau implements Environment{
	private int maximumX, maximumY, minimumX, minimumY;
	
	public Plateau(int maximumX, int maximumY) {
		this.maximumX = maximumX;
		this.maximumY = maximumY;
		this.minimumX = 0;
		this.minimumY = 0;
	}
	
	public Plateau() {
		this.maximumX = 10;
		this.maximumY = 10;
		this.minimumX = 0;
		this.minimumY = 0;
	}

	@Override
	public int getMinimumX() {
		return this.minimumX;
	}

	@Override
	public int getMinimumY() {
		return this.minimumY;
	}

	@Override
	public int getMaximumX() {
		return this.maximumX;
	}

	@Override
	public int getMaximumY() {
		return this.maximumY;
	}
}

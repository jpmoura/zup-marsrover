package vehicleTest;

import static org.junit.Assert.*;

import org.junit.Test;

import terrain.Environment;
import terrain.Plateau;
import vehicle.Rover;


/**
 * Test class for Rover class.
 * @author Joao Pedro Santos de Moura
 */
public class RoverTest {

	/**
	 * Test to check if the rover did rotate right from north direction.
	 */
	@Test
	public void testRotateRightHeadingNorth() {
		Rover testRover = new Rover();
		testRover.rotate('R');
		String expected = "0 0 E";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did rotate right from east direction.
	 */
	@Test
	public void testRotateRightHeadindEast() {
		Rover testRover = new Rover();
		testRover.setHeading('E');
		testRover.rotate('R');
		String expected = "0 0 S";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did rotate right from south direction.
	 */
	@Test
	public void testRotateRightHeadingSouth() {
		Rover testRover = new Rover();
		testRover.setHeading('S');
		testRover.rotate('R');
		String expected = "0 0 W";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did rotate right from west direction.
	 */
	@Test
	public void testRotateRightHeadingWest() {
		Rover testRover = new Rover();
		testRover.setHeading('W');
		testRover.rotate('R');
		String expected = "0 0 N";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did rotate left from north direction.
	 */
	@Test
	public void testRotateLeftHeadingNorth() {
		Rover testRover = new Rover();
		testRover.rotate('L');
		String expected = "0 0 W";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did rotate left from east direction.
	 */
	@Test
	public void testRotateLeftHeadingEast() {
		Rover testRover = new Rover();
		testRover.setHeading('E');
		testRover.rotate('L');
		String expected = "0 0 N";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did rotate left from south direction.
	 */
	@Test
	public void testRotateLeftHeadingSouth() {
		Rover testRover = new Rover();
		testRover.setHeading('S');
		testRover.rotate('L');
		String expected = "0 0 E";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did rotate left from west direction.
	 */
	@Test
	public void testRotateLeftHeadingWest() {
		Rover testRover = new Rover();
		testRover.setHeading('W');
		testRover.rotate('L');
		String expected = "0 0 S";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did move to north.
	 */
	@Test
	public void testMoveToNorth() {
		Rover testRover = new Rover();
		testRover.setX(5);
		testRover.setY(5);
		testRover.move();
		String expected = "5 6 N";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did move to east.
	 */
	@Test
	public void testMoveToEast() {
		Rover testRover = new Rover();
		testRover.setHeading('E');
		testRover.setX(5);
		testRover.setY(5);
		testRover.move();
		String expected = "6 5 E";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did move to south.
	 */
	@Test
	public void testMoveToSouth() {
		Rover testRover = new Rover();
		testRover.setHeading('S');
		testRover.setX(5);
		testRover.setY(5);
		testRover.move();
		String expected = "5 4 S";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did move to west.
	 */
	@Test
	public void testMoveToWest() {
		Rover testRover = new Rover();
		testRover.setHeading('W');
		testRover.setX(5);
		testRover.setY(5);
		testRover.move();
		String expected = "4 5 W";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did not move to north.
	 */
	@Test
	public void testCannotMoveToNorth() {
		Rover testRover = new Rover();
		testRover.setY(10);
		testRover.move();
		String expected = "0 10 N";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did not move to east.
	 */
	@Test
	public void testCannotMoveToEast() {
		Rover testRover = new Rover();
		testRover.setHeading('E');
		testRover.setX(10);
		testRover.move();
		String expected = "10 0 E";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did not move to south.
	 */
	@Test
	public void testCannotMoveToSouth() {
		Rover testRover = new Rover();
		testRover.setHeading('S');
		testRover.move();
		String expected = "0 0 S";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test to check if the rover did not move to west.
	 */
	@Test
	public void testCannotMoveToWest() {
		Rover testRover = new Rover();
		testRover.setHeading('W');
		testRover.move();
		String expected = "0 0 W";
		assertEquals(expected, testRover.toString());
	}
	
	/**
	 * Test for execution according to the inputs and outputs in the test document.
	 */
	@Test
	public void testInputInDescription() {
		Environment plateau = new Plateau(5, 5);
				
		Rover firstRover = new Rover(1, 2, 'N', plateau);
		Rover secondRover = new Rover(3, 3, 'E', plateau);
		
		firstRover.execute("LMLMLMLMM");
		secondRover.execute("MMRMMRMRRM");
		
		String expectedFromFirstRover = "1 3 N";
		String expectedFromSecondRover = "5 1 E";
		
		assertEquals(expectedFromFirstRover, firstRover.toString());
		assertEquals(expectedFromSecondRover, secondRover.toString());
	}

}

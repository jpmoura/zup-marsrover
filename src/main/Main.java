package main;

import terrain.Plateau;
import vehicle.Rover;

/**
 * Main class that executes the application.
 * @author Joao Pedro Santos de Moura
 */
public class Main {
	
	public static void main(String[] args) {
		
//		args = new String[5];
//		args[0] = "5 5";
//		args[1] = "1 2 N";
//		args[2] = "LMLMLMLMM";
//		args[3] = "3 3 E";
//		args[4] = "MMRMMRMRRM";
		
		if(args.length < 3) System.out.println("Insufficient arguments");
		else if(args.length > 2 && (args.length - 1) % 2 > 0) System.out.println("It is necessary to inform a pair of arguments (initial position, commands sequence) for each vehicle.");
		else
		{
			// Parsing environment maximum coordinates
			int maximumX = Character.getNumericValue(args[0].charAt(0));
			int maximumY = Character.getNumericValue(args[0].charAt(2));
			Plateau plateau = new Plateau(maximumX, maximumY);
			
			for(int index = 1; index < args.length; ++index)
			{
				// Parsing initial vehicle position
				int initialX = Character.getNumericValue(args[index].charAt(0));
				int initialY = Character.getNumericValue(args[index].charAt(2));
				char initialHeading = args[index].charAt(4);
				
				Rover rover = new Rover(initialX, initialY, initialHeading, plateau);
				rover.execute(args[++index]);
				System.out.println(rover.toString());
			}
		}

		System.exit(0);
	}

}
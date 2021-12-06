import becker.robots.City;
import becker.robots.Direction;

/**
 * 
 * @author Joseph Gmach
 *
 */

public class RobotTask{
	/**
	 * 
	 */
	public void run() {


		City waterloo = new City("Maze.txt");
		waterloo.showThingCounts(true);

		StatsBot sR= new StatsBot (waterloo, 6,5,Direction.NORTH,7);
		sR.clearMaze(0);
		sR.getItemsPicked();
		sR.getBlocksMoved();	
		sR.getColor();

		System.out.println("Final States of Robot:");
		System.out.println("Items picked up: " +sR.getItemsPicked());
		System.out.println("Blocks Moved: " +sR.getBlocksMoved());
		System.out.println("Turned left: " +sR.getLefts()+ " times");
		System.out.println("Turned right: " +sR.getRights()+ " times");
		System.out.println("Colour: " +sR.getColor());


	}

}

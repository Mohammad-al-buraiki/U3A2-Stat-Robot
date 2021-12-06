import becker.robots.*;
/**
 * 
 * @author you!
 *
 */
public class StatsBot extends RobotSE{

	// create a new state for items picked up
	private int itemsPicked;

	// create a new state for blocks moved
	private int blocksMoved;

	// create a new state for turnLeft moves
	private int turnLefts;

	// create a new state for turnRight moves
	private int turnRights;

	/**
	 * 
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4 
	 */
	public StatsBot(City arg0, int arg1, int arg2, Direction arg3, int arg4) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub

	}
	protected void clearMaze(int n) {
		// TODO Auto-generated method stub
		moveDL();
		moveDR();
		move();
		pick2();
		Lmove();
		Rmove();
		move();
		Lmove();
		turnRight();
		move();
		Lmove();
		turnRight();
		moveDL();
		move();
		pick3();
		turnLeft();
		move7();
		pick4();
		tBack();
		move7();
		turnRight();
		moveDR();
		moveDL();
		moveDL();
		moveDR();
		move5();
		pick2();
		tBack();
		move2();
		Lmove();
		Lmove();
		turnRight();
		moveDL();
		moveDR();
		move5();
		pick2();
		tBack();
		move5();
		Lmove();
		turnRight();
		moveDL();
		moveDR();
		moveDL();
		move3();
		Lmove();
		moveDL();
		moveDR();
		move2();
		Lmove();
		Rmove();
		Lmove();
		Rmove();
		tBack();

	}
	/**
	 * moves the robot twice
	 */
	public void move2() {
		move();
		move();
	}
	/**
	 * moves the robot three times
	 */

	public void move3() {
		// TODO Auto-generated method stub
		move();
		move();
		move();

	}
	/**
	 * moves the robot four times
	 */

	public void move4() {
		// TODO Auto-generated method stub
		move();
		move();
		move();
		move();

	}
	/**
	 * moves the robot five times
	 */

	public void move5() {
		// TODO Auto-generated method stub
		move();
		move();
		move();
		move();
		move();

	}
	/**
	 * moves the robot six times
	 */

	public void move6() {
		// TODO Auto-generated method stub
		move();
		move();
		move();
		move();
		move();
		move();

	}
	/**
	 * moves the robot seven times
	 */

	public void move7() {
		// TODO Auto-generated method stub
		move();
		move();
		move();
		move();
		move();
		move();
		move();

	}
	/**
	 * directs the robot to the right
	 */

	public void tBack() {
		// TODO Auto-generated method stub
		/**
		 * directs the robot to the back
		 */

		turnLeft();
		turnLeft();

	}

	public void moveDR() {
		// TODO Auto-generated method stub
		/**
		 * moves the robot once before directing it to the right
		 */
		move();
		turnRight();	

	}

	public void moveDL() {
		// TODO Auto-generated method stub
		/**
		 * moves the robot once before directing it to the left
		 */

		move();
		turnLeft();

	}

	public void Rmove() {
		// TODO Auto-generated method stub
		/**
		 * directs the robot to the right before moving it once
		 */
		turnRight();	
		move();

	}

	public void Lmove() {
		// TODO Auto-generated method stub
		/**
		 * directs the robot to the left before moving it once
		 */
		turnLeft();
		move();

	}

	public void pick2() {
		// TODO Auto-generated method stub
		/**
		 * picks two things at once
		 */
		pickThing();
		pickThing();
	}


	public void pick3() {
		// TODO Auto-generated method stub
		/**
		 * picks three things at once
		 */

		pickThing();
		pickThing();
		pickThing();

	}


	public void pick4() {
		// TODO Auto-generated method stub
		/**
		 * picks four things at once
		 */
		pickThing();
		pickThing();
		pickThing();
		pickThing();

	}


	// create a new state for items picked up

	public void pickThing() {
		super.pickThing();
		setItemsPicked(getItemsPicked() +1); //updates the number of items picked up
	}

	protected int getItemsPicked() {
		return itemsPicked;
	}

	protected void setItemsPicked(int itemsPicked) {
		this.itemsPicked = itemsPicked;
	}

	protected int getBlocksMoved() {
		return blocksMoved;
	}

	protected void setBlocksMoved(int blocksMoved) {
		this.blocksMoved = blocksMoved;
	}

	public void move() {
		super.move();
		blocksMoved++;
	}	

	protected int getLefts() {
		return turnLefts;
	}

	protected void setLefts(int turnLefts) {
		this.turnLefts = turnLefts;
	}

	public void turnLeft() {
		super.turnLeft();
		turnLefts++;
	}	

	protected int getRights() {
		return turnRights;
	}

	protected void setRights(int turnRights) {
		this.turnLefts = turnRights;
	}

	public void turnRight() {
		super.turnRight();
		turnRights++;
	}
	
}

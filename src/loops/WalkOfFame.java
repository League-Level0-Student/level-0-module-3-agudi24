
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		rob.moveTo(100, 400);
		rob.setSpeed(30);
		// You also need to show the robot to see the result of this line.
		for (int i = 10; i > 0; i++) {
			rob.penDown();
			rob.turn(144);
			rob.move(30);
			rob.turn(144);
			rob.move(30);
			rob.turn(144);
			rob.move(30);
			rob.turn(144);
			rob.move(30);
			rob.turn(144);
			rob.move(30);
			rob.penUp();
			rob.move(50);
		}
		// 2. Make the robot draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}

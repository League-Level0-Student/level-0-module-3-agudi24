
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		 Robot rob = new Robot();
		 rob.setSpeed(10);
		 int a = 144;
		 rob.setPenWidth(10);
		//3. ask the user what color they would like the robot to draw
		 for (int i = 0; i < 5;) {
         String color = JOptionPane.showInputDialog("What color do you want the robot to draw? (Pick any rainbow color). Don't type anything for a random color!");
         if (color.equalsIgnoreCase("Red")) {
        	 rob.setPenColor(255, 0, 0);
         }
         else if (color.equalsIgnoreCase("Orange")) {
        	 rob.setPenColor(255, 165, 0);
         }
         else if (color.equalsIgnoreCase("Yellow")) {
        	 rob.setPenColor(255, 255, 0);
         }
         else if (color.equalsIgnoreCase("Green")) {
        	 rob.setPenColor(0, 255, 0);
         }
         else if (color.equalsIgnoreCase("Blue")) {
        	 rob.setPenColor(0, 0, 255);
         }
         else if (color.equalsIgnoreCase("Purple")) {
        	 rob.setPenColor(128, 0, 128);
         }
         else {
        	 rob.setRandomPenColor();
         }
         rob.penDown();
         rob.setAngle(a);
         rob.turn(18);
         rob.move(250);
         rob.turn(a);
         rob.move(250);
         rob.turn(a);
         rob.move(250);
         rob.turn(a);
         rob.move(250);
         rob.turn(a);
         rob.move(250);
         rob.turn(a);
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)


	}
  }
}
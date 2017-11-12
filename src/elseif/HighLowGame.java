//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	int random = 1;
	int guessNum = 0;

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(101);
		// 2. Print out the random variable above
		// 11. do the following 10 times

		for (int i = 10; i < random; i++) {
			String guess = JOptionPane.showInputDialog("Guess a number between 1-100");
			int guessNum = Integer.parseInt(guess);
			if (guessNum < random) {
				JOptionPane.showMessageDialog(null, "Your guess was too low.");
			} else if (guessNum > random) {
				JOptionPane.showMessageDialog(null, "Your guess was too high.");
			} else if (guessNum == random) {
				JOptionPane.showMessageDialog(null, "You Win!");
				break;
			} else if (i >= 10) {
				JOptionPane.showMessageDialog(null, "You Lose!");
				break;
			}

		}
	}
	// 1. ask the user for a guess using a pop-up window, and save their response

	// 4. convert the users’ answer to an int (Integer.parseInt(string))

	// 5. if the guess is correct
	// 6. win
	// 7. if the guess is high
	// 8. tell them it's too high
	// 9. if the guess is low
	// 10. tell them it's too low

	// 12. tell them they lose
}

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ShinyObjects {
	public static void main(String[] args) {
		int shinyNum = 0;
		String objects = JOptionPane.showInputDialog("How many shiny objects do you want?");
		shinyNum = Integer.parseInt(objects);
		for (int i = 0; i < shinyNum; i++) {
			// 2. Ask the user how many shiny objects they want
			// 3. Play the sound that many times
			// 1. Call the method below
			playMisterZee();
		}
	}

	public static void playMisterZee() {
		try {

			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(ShinyObjects.class.getResource("shiny-objects.wav")));
			clip.start();
			Thread.sleep(3600);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

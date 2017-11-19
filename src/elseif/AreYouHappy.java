package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		int happy = JOptionPane.showConfirmDialog(null, "Are you happy?");
		if (happy == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		}
		if (happy == JOptionPane.NO_OPTION) {
			int want = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");

			if (want == JOptionPane.OK_OPTION) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			if (want == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}

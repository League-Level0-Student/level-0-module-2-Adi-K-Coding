package extra;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age = JOptionPane.showInputDialog("How old are you?");
		int age2 = Integer.parseInt(age);
		if (age2 > 18) {
			JOptionPane.showInputDialog("Who do you think the next president should be ?");
			JOptionPane.showMessageDialog(null, "Ok");
		}
		else {
			JOptionPane.showInputDialog("Who do you think the next president should be?");
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
		}
	}
}

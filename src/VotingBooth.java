import javax.swing.JOptionPane;
public class VotingBooth {
public static void main(String[] args) {
	int votea = 0;
	int voteb = 0;
	for (int i = 0; i < 10; i++) {
		String UserInput = JOptionPane.showInputDialog("Who would you like to be queen/king of all living life and known universe? Tyler Joseph or Brendon Urie?");
		if(UserInput.equals("Tyler Joseph")) {
			votea++;
		}
		else if(UserInput.equals("Brendon Urie")) {
			voteb++;
		}
	}
	if(votea>voteb) {
		JOptionPane.showMessageDialog(null, "Congrats! Tyjo won.");
	}
	else if(voteb>votea) {
		JOptionPane.showMessageDialog(null, "Congrats! Brendon won.");
	}
	else if(votea==voteb) {
		JOptionPane.showMessageDialog(null, "Well, it looks like both of them won. Perhaps that's a good thing.");
	}
}
}

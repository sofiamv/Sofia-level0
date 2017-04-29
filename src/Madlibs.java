
	import javax.swing.JOptionPane;

	public class Madlibs {
		public static void main(String[] args) {

			// Put this sentence in a pop up:
			// If you find yourself having to cross a piranha-infested river, here's how to do it...
			JOptionPane.showMessageDialog(null, "If YOU find yourself having to cross a pirahna-infested river, here's how to do it:");

			// Get the user to enter an adjective
			String adjective = JOptionPane.showInputDialog("Ok, first you need to type in an adjetive. or two.");

			// Get the user to enter a type of liquid
			String liquid = JOptionPane.showInputDialog("Now, put in a type of liquid. What type of liquid depends on you.");

			// Get the user to enter a body part
			String bodypart = JOptionPane.showInputDialog("This may seem weird but type in a body part...");

			// Get the user to enter a verb
			String verb = JOptionPane.showInputDialog("Alright, now type in a verb.");

			// Get the user to enter a place
			String place = JOptionPane.showInputDialog("Ok, final step: put in a place.");

			// Fit the user's words into this sentence, and save it in a String:
			// Piranhas are more [adjective] during the day, so cross the river at
			// night. Piranhas are attracted to fresh [type of liquid] and will most
			// likely take a bite out of your [body part] if you [verb]. Whatever
			// you do, if you have an open wound, try to find another way to get
			// back to the [place]. Good luck!
			JOptionPane.showInputDialog("Your earnings for filling out these answers are if you click the ok button. Ready?");
			JOptionPane.showMessageDialog(null, "Piranhas are more " + adjective + " during the day, "
					+ "so cross the river at night. Pirahnas are attracted to fresh " + liquid + " and will most likely take a bite \n out of your " + bodypart + " if you "
							+ verb + ". Whatever your do, if you have an open wound, try to find \n another way to get back to " + place + ". Good luck!");
			// Make a pop-up for the final story. You can use \n to go to the next line.
			

		}
	}

	



	//Copyright Wintriss Technical Schools 2014
	import javax.swing.JOptionPane;

	public class Candycrush {

		public static void main(String[] args) {
			// 1. Using a pop-up, ask the user who they don't like
			String name = JOptionPane.showInputDialog("Type in someone who you absolutely despise and have the desire to send them to the depths of hades.");

			// 2. Change the next line so that the pop-up will tell them they have a crush on that person
			JOptionPane.showMessageDialog(null, "You totally have a crush on " + name + ">:)))))");
			// 3. Ask the user for the name of their best friend
			String nametwo = JOptionPane.showInputDialog("Now type in someone who is your bestest bestest friend, your best friend forever, two peas in a pod. you get the idea.");

			// 4. Tell them their best friend is as sweet as candy
			JOptionPane.showMessageDialog(null, nametwo + " is as sweet as candy :>>>>");

		} 
	}



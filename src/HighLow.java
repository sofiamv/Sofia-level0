 import java.util.Random;

import javax.swing.JOptionPane;
 
// Copyright Wintriss Technical Schools 2013
public class HighLow {
 
	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		// 11. do the following 10 times
		for(int i = 0; i < 5; i++){
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String answerone = JOptionPane.showInputDialog("Guess a number from 1 to 100:");
		

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int answertwo =	Integer.parseInt(answerone);
		if(answertwo==random){
			JOptionPane.showMessageDialog(null, "Congrats, ya W O N!!!!");
		}
			// 5. if the guess is correct
				// 6. win
			// 7. if the guess is high
			if(answertwo>random) {
				JOptionPane.showMessageDialog(null, "Too high!! Ya lose haha >:DD");
			}
				// 8. tell them it's too high
			if(answertwo<random) {
				JOptionPane.showMessageDialog(null, "Too low!! Ya lose haha >:DD");
			}
		}
			// 9. if the guess is low
				// 10. tell them it's too low
 
		// 12. tell them they lose
	}
}
	
 



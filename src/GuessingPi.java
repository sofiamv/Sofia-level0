import javax.swing.JOptionPane;

public class GuessingPi {
	public static void main(String[] args) {
		
	
	// 1. Make a main method and make sure your program can run

		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
String pi = "3.141592653589793238462643383279502884197169399375105820";
		// 3. Print out the first 3 digits of Pi to the console
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
/*System.out.print( pi.charAt(0));
System.out.print( pi.charAt(1));
System.out.print( pi.charAt(2));
System.out.print( pi.charAt(3));
*/
		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.
for (int i = 0; i < pi.length(); i++) {
	

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
	JOptionPane.showMessageDialog(null, pi);
	
	
				// 5. Ask the user for the NEXT digit of pi.
String answer = JOptionPane.showInputDialog("What is the next digit of pi?");
if(answer.equals("9")){
	System.out.println("Correct.");
	break;
}else{
	System.out.println("Incorrect. Start over!");

}
				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 

					// 7. If they are correct, print out "correct".

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
}
}
}



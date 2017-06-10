
	 // Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;
	 
	public class BirthdayReminder {
	 
		public static void main(String[] args) {
		
			// 1. correct the birthdays for your family below
			String momsBirthday = "May 17th(???)";
			String dadsBirthday = "February 13th(???)";
			String myBirthday = "June 3rd";
			String frenBirthday = "October 28";
			String sistersBirthday = "November 8";
	 
			// 2. Find out which birthday the user wants and and store their response in a variable
		String userbirthday = JOptionPane.showInputDialog("This is an innaccurate and unreliable birthday reminder. Type in a name to learn their birthday:");
			// 3. Print out what the user typed
				System.out.println(userbirthday);
		
			// 4. if user asked for "mom"
		if(userbirthday.equals("mom")){
			System.out.println(momsBirthday);
}
		
		else if(userbirthday.equals("dad")){
			System.out.println(dadsBirthday);
		}
		else if(userbirthday.equals("jules")){
			System.out.println(frenBirthday);
		}
		
		else if(userbirthday.equals("Sofia")){
			System.out.println(myBirthday);
		}
		else if(userbirthday.equals("sister")){
			System.out.println(sistersBirthday);
		}
				//print mom's birthday
			// 5. if user asked for "dad"
				// print dad's birthday
			// 6. if user asked for your name
				// print myBirthday
		else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
			//7. otherwise print "Sorry, i don't remember that person's birthday!"
	 
		} 
	}



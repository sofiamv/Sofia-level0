import javax.swing.JOptionPane;
public class TestScorer {
public static void main(String[] args) {
	String UserInput = JOptionPane.showInputDialog("On your most recent test, what score did you get? Be honest, i'll know if you lie. we all do. watch your back. Also extra credit doesn't count. >:o");
	double testscore  = Double.parseDouble(UserInput);
	if(testscore<=100 && testscore>=97) {
		JOptionPane.showMessageDialog(null, "You got an A+, I assume. Good job, NERD!!!");
	}
	else if(testscore <= 96.9 && testscore >= 93) {
		JOptionPane.showMessageDialog(null, "You got an A, I assume. Good job, NERD!!!");
	}
	else if (testscore <= 92.9 && testscore >= 90) {
		JOptionPane.showMessageDialog(null, "You got an A-, I assume. Good job!!!");
	}
	else if (testscore <= 89.9 && testscore >= 87) {
		JOptionPane.showMessageDialog(null, "You got an B+, I assume. Good job.");
	}
	else if (testscore <= 86.9 && testscore >= 83) {
		JOptionPane.showMessageDialog(null, "You got an B, I assume. Good job.");
	}
	else if (testscore <= 82.9 && testscore >= 80) {
		JOptionPane.showMessageDialog(null, "You got an B-, I assume. Well, that's probably what i'd get, if I took a test right now. props to you.");
	}
	else if (testscore <= 79.9 && testscore >= 77) {
		JOptionPane.showMessageDialog(null, "You got an C+, I assume. Maybe you should study more.");
	}
	else if (testscore <= 76.9 && testscore >= 73) {
		JOptionPane.showMessageDialog(null, "You got an C, I assume. Maybe you should study more.");
	}
	else if (testscore <= 72.9 && testscore >= 70) {
		JOptionPane.showMessageDialog(null, "You got an C-, I assume. Maybe you should study more.");
	}
	else if (testscore <= 69.9 && testscore >= 67) {
		JOptionPane.showMessageDialog(null, "You got an D+, I assume. Maybe you should study more. Please take my advice. Your GPA depends on it.");
	}
	else if (testscore <= 66.9 && testscore >= 63) {
		JOptionPane.showMessageDialog(null, "You got an D, I assume. Maybe you should study more. Please take my advice. Your GPA depends on it.");
	}
	else if (testscore <= 62.9 && testscore >= 60) {
		JOptionPane.showMessageDialog(null, "You got an D-, I assume. Maybe you should study more. Please take my advice. Your GPA depends on it.");
	}
	else if (testscore <= 59.9) {
		JOptionPane.showMessageDialog(null, "You got an F, an F+, or an F-, I assume. LORD WHAT HAVE YOU BEEN DOING FOR THE PAST WEEK YOU SHOULD REALLY STUDY MORE OH MY GOD >:o");
	

	}
}
}

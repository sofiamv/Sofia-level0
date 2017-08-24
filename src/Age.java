import javax.swing.JOptionPane;
public class Age {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("What age are you?");
	int agetwo = Integer.parseInt(age);
	if(agetwo<=0) {
		JOptionPane.showMessageDialog(null, "Error. How are you even reading this?");
	}
	else if(agetwo<=17) {
		JOptionPane.showMessageDialog(null, "You must have a parent if you plan to watch all movies.");
	}
	else if(agetwo>=18) {
		JOptionPane.showMessageDialog(null, "You can watch all the movies! Good for you.");
	}
}
}

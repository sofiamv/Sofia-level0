import javax.swing.JOptionPane;
public class Gandalf {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String num = JOptionPane.showInputDialog("Put down a number.");
	int number = Integer.parseInt(num);
	for (int i = 0; i < number; i++) {
		System.out.println(name);
	}
}
}

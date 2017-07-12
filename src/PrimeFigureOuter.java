import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class PrimeFigureOuter {
public static void main(String[] args) {

	int tercount = 0;	
	//boolean isPrime = true;
	String answer = JOptionPane.showInputDialog("Name a number in between 2 and 100:");
	int sweran = Integer.parseInt(answer);
	for(int i = 1; i<=sweran; i++ ){
		if (sweran%i == 0) {
			tercount++;
			
		}
	}
	if (tercount > 2) {
		System.out.println("composite");
	}
	else if (tercount == 2) {
		System.out.println("prime");
		
			}
	else if (tercount != 2);
	JOptionPane.showMessageDialog(null, "Error. you didn't put down a number between 2 and 100. READ THE DIRECTIONS NEXT TIME YOU DUMBNUT");
		}
	}


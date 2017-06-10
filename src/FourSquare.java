import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot john = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		john.setSpeed(9000);

		// 5. Set the pen width to 5
		john.setPenWidth(5);

		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
		for (int i = 0; i < 360; i++) {
			
		
		john.setRandomPenColor();
		drawSquare();
		john.turn(1);
	}
	

	


	
			// 8. Turn the robot 90 degrees to the right
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		john.penDown();
		for (int i = 0; i < 4; i++) {
			john.move(50);
			john.turn(90);
		}
		john.penUp();

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}

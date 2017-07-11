
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int number = 100; number >= 0; number--) {
			System.out.println(number);
		}
		for (int numbertwo = 0; numbertwo <= 100; numbertwo++) {
			System.out.println(numbertwo);
		}
		for (int numberthree = 2; numberthree <= 100; numberthree += 2) {
			System.out.println(numberthree);

		}
		for (int numberfour = 1; numberfour <= 99; numberfour += 2) {
			System.out.println(numberfour);
		}
		for (int numberfive = 1; numberfive <= 500; numberfive++) {
			if (numberfive % 2 == 0) {
				System.out.println(numberfive + ": even");
			}
			if (numberfive % 2 > 0) {
				System.out.println(numberfive + ": odd");
			}

		}
		for (int numbersix = 7; numbersix <= 777; numbersix += 7) {
			System.out.println(numbersix);
		}
		for (int numberseven = 0, numbersevena = 2005; numberseven <= 12; numberseven++, numbersevena++) {
			System.out.println("in" + numbersevena + ", I was " + numberseven + " years old.");
		}
		for (int numbereight = 0; numbereight <= 2; numbereight++) {
			for (int numbereighta = 0; numbereighta <= 2; numbereighta++) {
				System.out.println(numbereight + " " + numbereighta);
			}
			for (int numbernine = 1; numbernine <= 9; numbernine++) {
				System.out.print(numbernine);
				if (numbernine % 3 == 0) {
					System.out.println();
				}
				for (int numberten = 1; numberten <= 100; numberten++) {
					System.out.print(numberten);
					if (numberten % 10 == 0) {
						System.out.println();
					}
					for(int numbereleven = 0; numbereleven <= 6; numbereleven++){
						for(int numberelevena=0; numberelevena <6; )
						

					}
				}

			}

		}
	}
}

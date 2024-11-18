// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int highSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		int lastValue = 0;
		int nextSeed = 1;
		int currentValue = nextSeed;
		int iterations = 1;

		for (int i = 0; i < highSeed; i++) {
			if (mode.equals("v")) {
				System.out.print(currentValue + " ");
			}
			while (lastValue != 1) {
				if (currentValue % 2 == 0) {
					currentValue = currentValue / 2;
					if (mode.equals("v")) {
						System.out.print(currentValue + " ");
					}
					lastValue = currentValue;
					iterations++;
				}
				else {
					currentValue = currentValue * 3 + 1;
					if (mode.equals("v")) {
						System.out.print(currentValue + " ");
					}
					lastValue = currentValue;
					iterations++;
				}
				if (mode.equals("v") && lastValue == 1) {
					System.out.println("(" + iterations + ")");
				}
			}
			nextSeed++;
			currentValue = nextSeed;
			lastValue = currentValue;
			iterations = 1;
		}

		System.out.println("Every one of the first " + highSeed + " hailstone sequences reached 1.");
		

	}
}

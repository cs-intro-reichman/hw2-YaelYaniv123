// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numTerms = Integer.parseInt(args[0]);
		double calc = 0.0;
		int counter = 1;
		
		for (int i = 0; i <= numTerms - 1; i++) {
			calc = calc + (double) 1 / counter;
			counter = counter + 2;
			if (i + 1 <= numTerms) {
				calc = calc - (double) 1 / counter;
				counter = counter + 2;
				i++;
			}
		}
		calc = calc * 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (double)calc);
	}
}

// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numTerms = Integer.parseInt(args[0]);
		double calc = 0.0;
		int denominator = 1;
		
		for (int i = 0; i <= numTerms - 1; i++) {
			if (i % 2 == 0){
				calc = calc + (double) 1 / denominator;
				denominator = denominator + 2;
			}
			else {
				calc = calc - (double) 1 / denominator;
				denominator = denominator + 2;
			}
		}

		calc = calc * 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (double)calc);
	}
}

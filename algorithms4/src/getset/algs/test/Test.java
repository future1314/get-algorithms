package getset.algs.test;

import getset.algs.stdlib.StdOut;

public class Test {

	private static int count = 1;
	public static void main(String[] args) {
		// MARK Integer.MIN_VALUE的绝对值还是Integer.MIN_VALUE
		System.out.println(Math.abs(Integer.MIN_VALUE));
		
		// exe1.1.3
		System.out.println((Integer.parseInt(args[0]) == Integer.parseInt(args[1])) ? 
				((Integer.parseInt(args[1]) == Integer.parseInt(args[2])) ? 
						"equal" : "not equal") : "not equal");
		
		exe1_1_6();
		
		System.out.println(binormal(10, 5, 0.25));
	}
	
	// exe1.1.6
	public static void exe1_1_6() {
		int f = 0;
		int g = 1;
		for (int i = 0; i < 15; i++) {
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
	
	// exe1.1.27
	public static double binormal(int N, int k, double p) {
		System.out.println(count++);
		if (N == 0 && k == 0) return 1.0;
		if (N < 0 || k < 0) return 0.0;
		return (1.0 - p) * binormal(N-1, k, p) + p * binormal(N-1, k-1, p);
	}
}

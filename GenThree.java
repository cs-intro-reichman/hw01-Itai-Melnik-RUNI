/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int x1, x2, x3;

		x1 = (int) (Math.random() * (b - a)) + a;
		x2 = (int) (Math.random() * (b - a)) + a;
		x3 = (int) (Math.random() * (b - a)) + a;

		int minValue = Math.min(x1, x2);
		minValue = Math.min(minValue, x3);

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);

		System.out.println("Minimum value generated: " + minValue);

	}
}

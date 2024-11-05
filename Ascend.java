// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
		double num = Math.random()*max;
		int a = (int)num;
	    num = Math.random()*max;
		int b = (int)num;
		num = Math.random()*max;
		int c = (int)num;

		System.out.println(a+" "+b+" "+c);

		

		System.out.println(Math.min(Math.min(a, b), Math.min(c, b))+" "+Math.max(Math.min(a, b), Math.min(c, b))+" "+Math.max(Math.max(a, b), Math.max(c, b)));

	}
}

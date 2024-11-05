// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	     int num = Integer.parseInt(args[0]);
		 if (num>999||num<0) {
			System.out.println("number is not valid");
			return;
		 }

		 int hundreds=num/100;
		 int tens = (num/10)%10;
		 int ones = num%10;
		 System.out.println(hundreds+" hundreds "+tens+" tens "+ones+" ones");


	}
}

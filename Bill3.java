// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0],
	     name2 = args[1],
		 name3 = args[2]; 
		int bill = Integer.parseInt(args[3]);


		

		System.out.println("Dear "+name1+", "+name2+" and "+name3+": pay "+String.format("%.2f",(double)bill/3)+" Shekels each");
	}
}

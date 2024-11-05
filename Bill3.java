// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = System.console().readLine(),
	     name2 = System.console().readLine(),
		 name3 = System.console().readLine(); 
		int bill = Integer.parseInt(System.console().readLine());


		System.out.println("Dear "+name1+", "+name2+" and "+name3+": pay "+(double)bill/3+" Shekels each");
	}
}

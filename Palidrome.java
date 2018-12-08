/*
 * Check to see if a user input a Palidrome
 * @author Brendon Baughn
 * @version 20180920
 */
import java.util.Scanner;
public class Palidrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// make user enter a string
		System.out.print("Enter a string: ");
		String pal = input.nextLine();
		// loop through until get empty line
		while (!pal.isEmpty()) {
			if (pal.length() > 0) {
				String reverse = "";
				int i;
				for (i = pal.length() - 1; i >= 0; --i) {
					reverse = reverse + pal.charAt(i);
				}
				if (pal.equals(reverse)) {
					System.out.println(pal + " is a palidrome");
					System.out.println();
				} else {
					System.out.println(pal + " is not a palidrome");
					System.out.println();
				}
				System.out.print("Enter a string: ");
				pal = input.nextLine();
			}
		}
		System.out.println("Empty line read - Goodbye!");
		input.close();
	}

}

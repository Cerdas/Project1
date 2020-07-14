import java.util.Random;
import java.util.Scanner;

public class CaesarCode {

	public static void main(String[] args) {
		
		// Creating Scanner and Random
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// Creating variables and initialize
		int plaintext = 0;
		int key = ran.nextInt(9);
		
		// Creating "for" loop for plaintext
		for(int i = 0; i <= 4; i++) {
			
			System.out.print("Enter a value between 0 - 19: ");
			int num = scan.nextInt();
			
			// If number is out of range terminate program
			// else add number to plaintext
			if(num > 19 || num < 0) {
				System.out.print("Please read directions and try again!");
				System.exit(0);
			}
			else {
				plaintext += num;
			}
			
		}
		
		// Breaking down Encode number formula into parts
		int a = ((plaintext / 10) + key) % 10;
		int b = ((plaintext % 10) + key) % 10;
		int encode = a*10 + b;

		// Printing out plaintext, key and encoded number
		System.out.println("Number is " + plaintext + ", Key is " + key);
		System.out.println("The encoded number will be " + encode +
				", since (" + (plaintext / 10) + "+" + key +
				")%10=" + a + " and (" + (plaintext % 10) + "+" +
				key + ")%10=" + b);
		
	}

}

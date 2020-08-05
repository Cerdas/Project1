
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

		System.out.println("Programming Fundamentals");
		System.out.println("Name: Alexander Cerdas");
		System.out.println("PROGRAMMING ASSIGNMENT" + "\n");
		System.out.println("Welcome to the Cipher program");
		System.out.println("Please enter 5 numbers between 0 and 19");

		// Creating "for" loop for plaintext
		for (int i = 0; i <= 4; i++) {
			int num;
			if (i == 0) {
				System.out.print("1st number: ");
				num = scan.nextInt();
			} else if (i == 1) {
				System.out.print("2nd number: ");
				num = scan.nextInt();
			} else if (i == 2) {
				System.out.print("3rd number: ");
				num = scan.nextInt();
			} else if (i == 3) {
				System.out.print("4th number: ");
				num = scan.nextInt();
			} else {
				System.out.print("5th number: ");
				num = scan.nextInt();
			}

			// If number is out of range terminate program
			// else add number to plaintext
			if (num > 19 || num < 0) {
				System.out.print("Please read directions and try again!");
				System.exit(0);
			} else {
				plaintext += num;
			}

		}

		// Breaking down Encode number formula into parts
		int a = ((plaintext / 10) + key) % 10;
		int b = ((plaintext % 10) + key) % 10;
		int encode = a * 10 + b;

		// Printing out plaintext, key and encoded number
		System.out.println("Total = " + plaintext);
		System.out.println("Your random key is " + key);
		System.out.println("Your encoded number is " + encode);

	}

}

// Programming Fundamentals
// Alexander Cerdas
// Programming assignment 1

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
		
		System.out.println("Welcome to the Cipher program");
		System.out.println("Please enter 5 numbers between 0 and 19");
		
		// Creating "for" loop for plaintext
		for(int i = 0; i <= 4; i++) {
			
			System.out.print("Enter number " + (i+1) + ": ");
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
		System.out.println("Total = " + plaintext);
		System.out.println("Your random key is " + key);
		System.out.println("Your encoded number is " + encode);
		
	}

}

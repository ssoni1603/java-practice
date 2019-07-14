package practice.Basics;

import java.util.Scanner;

public class ScanNumber {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(Scanner.in); -- confusion
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = scan.nextInt();
		scan.close();

		System.out.println("The number entered by you is: " + num);
	}

}

package practice.Basics;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Base: ");
		double base = scan.nextDouble();
		System.out.println("Enter Height: ");
		double height = scan.nextDouble();
		double area = (base*height)/2;
		System.out.println("Area is: "+area);

	}

}

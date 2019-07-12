package practice.Arrays;

import java.util.Scanner;

public class Add2UserInputMatrices {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int b = scan.nextInt();
        int a[] = new int[b];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < b; i++) {
            a[i] = scan.nextInt();
            sum = sum + a[i];

        }
        System.out.println("Sum of all array elements is: " + sum);
    }

}
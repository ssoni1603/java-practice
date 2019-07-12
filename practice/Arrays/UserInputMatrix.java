package practice.Arrays;
import java.util.Scanner;

public class UserInputMatrix {
    public static void main(String[] args) {
        int a[] = new int[]{};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int b = scan.nextInt();
        int c[] = new int[b + 1];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < b; i++) {
            c[i] = scan.nextInt();
        }

        for (int k : c) {

            System.out.println(k);


        }
    }

}
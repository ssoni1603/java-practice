package practice.Arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int a = sc.nextInt();
        int b[] = new int[a];
//        int j = b.length; //4
        for (int i = 0; i < b.length; i++) {
            b[i] = b.length - i - 1;  //0 1 2 3
            System.out.println(b[i]);
        }
    }
}

/**
 *
 */
package practice.Basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter an operator('+'/'-'/'*'/'/'): ");
        char operator = scan.next().charAt(0);
        scan.close();

        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Wrong input");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

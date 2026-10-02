package basic;

import java.util.Scanner;

public class QuotientOfTwoNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number :");
        float n1 = s.nextFloat();
        System.out.print("Enter the second number :");
        float n2 = s.nextFloat();
        float mul = n1 / n2;
        System.out.println("Quotient = " + mul);
    }
}
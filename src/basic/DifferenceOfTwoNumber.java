package basic;

import java.util.Scanner;

public class DifferenceOfTwoNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();
        int diff = n1 - n2;
        System.out.println("Difference = "+ diff);
    }
}

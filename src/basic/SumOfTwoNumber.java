package basic;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum of two number = "+ sum);
    }
}

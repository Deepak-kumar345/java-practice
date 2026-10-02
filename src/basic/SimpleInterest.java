package basic;

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        float P = s.nextFloat();
        System.out.print("Enter the Rate of Interest: ");
        float R = s.nextFloat();
        System.out.print("Enter the Time: ");
        float T = s.nextInt();
        float interest = (P * R * T) / 100;
        System.out.println("Simple Interest = " + interest);

    }
}
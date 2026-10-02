package basic;

import java.util.Scanner;

public class RectangleOfArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length :");
        int l = s.nextInt();
        System.out.print("Enter the breath :");
        int b = s.nextInt();
        int area = l * b;
        System.out.println("Area of Rectangle = " + area);
    }
}
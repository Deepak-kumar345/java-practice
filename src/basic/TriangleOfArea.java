package basic;

import java.util.*;

public class TriangleOfArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int b = s.nextInt();
        System.out.print("Enter the height: ");
        int h = s.nextInt();
        int area = (b * h)/2;
        System.out.println("Triangle Of Area = " + area);
    }
}

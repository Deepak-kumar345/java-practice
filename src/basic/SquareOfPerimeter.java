package basic;

import java.util.Scanner;
import java.util.*;

public class SquareOfPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = s.nextInt();

        int peri = 4 * side;
        System.out.println("Square of Perimeter = " + peri);
    }
}
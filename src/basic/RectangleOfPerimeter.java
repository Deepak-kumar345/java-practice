package basic;
import java.util.*;

public class RectangleOfPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = s.nextInt();
        System.out.print("Enter the breath: ");
        int b = s.nextInt();
        int peri = 2 * (l + b);
        System.out.println("Rectangle of Perimeter = " + peri);
    }
}
package basic;
import java.util.*;

public class SquareOfArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side : ");
        int sd = s.nextInt();
        int side = sd * sd;
        System.out.println("Remender = " + side);
    }
}

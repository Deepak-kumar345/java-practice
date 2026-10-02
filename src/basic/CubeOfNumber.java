package basic;
import java.util.*;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int cube = n * n * n;
        System.out.println("Cube = " + cube);
    }
}
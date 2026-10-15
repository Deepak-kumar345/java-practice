package basic;
import java.util.*;

public class NToZeroPrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = s.nextInt();
        int i = x;
        while (i >= 0){
            System.out.println(i);
            i--;
        }
    }
}

package basic;
import java.util.*;

public class NToOnePrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        int i = a;
        while (i >= 1){
            System.out.println(i);
            i--;
        }
    }
}

package basic;
import java.util.*;

public class OneToNOddPrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = s.nextInt();
        int i = 1;
        while (i <= x){
            if (i %2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}

package basic;
import java.util.*;

public class ZeroToNPrintWhileLoop {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int a = s.nextInt();
       int i = 0;
       while (i <= a){
           System.out.println(i);
           i++;
       }
    }
}

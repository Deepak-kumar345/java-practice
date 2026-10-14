package basic;
import java.util.*;

public class TablePrintWhileLoop {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int a = s.nextInt();
       int i = 1;
       while (i<=10){
           System.out.println(a + " * "+ i +" = "+ (a*i));
           i++;
       }
    }
}

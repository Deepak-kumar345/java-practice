package basic;
import java.util.*;

public class MultipleOfNPrintLoop {
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int n = s.nextInt();
         for (int i=1; i<=n; i++){
             System.out.println(n +" x "+ i + " = "+ (n * i));
         }
     }
}

package basic;
import java.util.*;

public class NToOneLoop {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = s.nextInt();
       for(int i=n; i>=1; i--){
           System.out.println(i);
       }
   }
}

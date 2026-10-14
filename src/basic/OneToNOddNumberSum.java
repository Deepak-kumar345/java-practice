package basic;
import java.util.*;

public class OneToNOddNumberSum {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num = s.nextInt();
       int sum = 0;
       for (int i=0; i<=num; i++) {
           if(i%2 != 0) {
               System.out.println(i);
               sum = sum + i;
           }
       }
       System.out.println("sum = "+ sum);
    }
}

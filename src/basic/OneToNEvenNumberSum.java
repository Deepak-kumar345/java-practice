package basic;
import java.util.*;

public class OneToNEvenNumberSum {
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int n = s.nextInt();
         int sum = 0;
         for (int i=0; i<=n; i++){
             if(i%2==0){
                 System.out.println(i);
                 sum = sum + i;
             }
         }
         System.out.println("sum = "+ sum);
     }
}

package basic;
import java.util.*;

public class OneToNDivByThreeSum {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int a = s.nextInt();
       int sum = 0;
       for (int i=1; i<=a; i++){
           if (i %3 == 0){
               System.out.println(i);
               sum = sum + i;
           }
       }
       System.out.println("Sum = " + sum);
    }
}

package basic;
import java.util.*;

public class SmallestNumber {
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int a = s.nextInt();
         System.out.print("Enter the second number: ");
         int b = s.nextInt();
         System.out.print("Enter the third number: ");
         int c = s.nextInt();
         if(a < b && a < c){
             System.out.println("A is smaller");
         } else if (b < c && b < a) {
             System.out.println("B is smaller");
         }else {
             System.out.println("C is smaller");
         }
     }
}

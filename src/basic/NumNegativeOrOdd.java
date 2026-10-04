package basic;
import java.util.*;

public class NumNegativeOrOdd {
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int num = s.nextInt();
         if(num < 0){
             System.out.print("Number is negative");
         }if(num %2 != 0){
             System.out.print("Number is odd");
         }else {
             System.out.println("Number is even");
         }
     }
}

package basic;
import java.util.*;

public class EqualTwoNumber {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the 1st number: ");
       int a = s.nextInt();
       System.out.print("Enter the 2nd number: ");
       int b = s.nextInt();
       System.out.print("Enter the 3rd number: ");
       int c = s.nextInt();
       if(a == b || a == c || b == c){
           System.out.println("Two number is equal");
       }else {
           System.out.println("No any equal");
       }
   }
}

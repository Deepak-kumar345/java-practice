package basic;
import java.util.Scanner;


public class OneToNDivByThreeLoop {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int a = s.nextInt();
       for (int i=0; i<=a; i++){
           if (i %3 == 0){
               System.out.println(i);
           }
       }
   }

}

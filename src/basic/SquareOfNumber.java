package basic;
import java.util.*;

public class SquareOfNumber {
      public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n = s.nextInt();
          int square = n * n;
          System.out.println("Square = "+ square);
      }
}

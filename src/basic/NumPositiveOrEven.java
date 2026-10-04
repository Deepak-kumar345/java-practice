package basic;
import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.*;

public class NumPositiveOrEven {
      public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n = s.nextInt();
          if(n > 0 ){
              System.out.println("Number is positive");
          }if (n %2 == 0){
              System.out.println("Number is even");
          }else {
              System.out.println("Number is odd");
          }
      }

}

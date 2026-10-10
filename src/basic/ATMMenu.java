package basic;
import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.*;

public class ATMMenu {
      public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          System.out.print("Enter your choice: ");
          int choice = s.nextInt();
          switch (choice){
              case 1:
                  System.out.println("Balance Check");
                  break;
              case 2:
                  System.out.println("Deposit");
                  break;
              case 3:
                  System.out.println("Withdraw");
                  break;
              case 4:
                  System.out.println("Exit");
                  break;
              default:
                  System.out.println("invalid choice");
          }
      }
}

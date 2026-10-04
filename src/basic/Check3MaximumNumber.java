package basic;
import java.util.*;

public class Check3MaximumNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = s.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println("First number is maximum");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Second number is maximum");
        }else {
            System.out.println("Third number is maximum");
        }
    }
}

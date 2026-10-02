package basic;
import java.util.*;

public class CheckThreeNumGreater {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = s.nextInt();
        if(num1 > num2){
            System.out.println("First number is greater");
        } else if (num2 > num3) {
            System.out.println("Second number is greater");
        }else {
            System.out.println("Third number is greater");
        }

    }
}

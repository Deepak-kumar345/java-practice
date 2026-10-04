package basic;
import java.util.*;

public class NumberCheckDivisibility {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number  = s.nextInt();
        if(number % 3 == 0){
            System.out.println("Number is divisible by 3");
        }
        if (number % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is invalid");
        }
    }
}

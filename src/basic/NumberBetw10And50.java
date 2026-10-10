package basic;
import java.util.*;

public class NumberBetw10And50 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = s.nextInt();
        if(number >= 10 && number <= 50){
            System.out.println("number between 10 and 50 = "+number);
        }else {
            System.out.println("invalid");
        }
    }
}

package basic;
import java.util.*;

public class ChekLeapYear {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = s.nextInt();
        if(year %400 == 0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not leap year");
        }
    }
}

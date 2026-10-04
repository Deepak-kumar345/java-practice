package basic;
import java.util.*;

public class CheckTempreaturePoint {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        int temp = s.nextInt();
        if(temp < 10){
            System.out.println("Cold");
        } else if (temp > 10 && temp <= 25) {
            System.out.println("Normal");
        } else if (temp > 26 && temp <= 35) {
            System.out.println("Worm");
        } else {
            System.out.println("Hot");

        }
    }
}

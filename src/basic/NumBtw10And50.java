package basic;
import java.util.*;

public class NumBtw10And50 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if(n >= 10 && n <= 50){
            System.out.println("Number lie between 10 and 50");
        }else {
            System.out.println("Number do not lie between 10 and 50");
        }
    }
}


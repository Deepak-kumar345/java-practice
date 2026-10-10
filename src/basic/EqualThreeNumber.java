package basic;
import java.util.*;

public class EqualThreeNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int x = s.nextInt();
        System.out.print("Enter the 2nd number: ");
        int y = s.nextInt();
        System.out.print("Enter the 3rd number: ");
        int z = s.nextInt();
        if(x == y || x == z || y == z){
            System.out.println("all number is Equal");
        }else {
            System.out.println("TryAgain");
        }
    }
}

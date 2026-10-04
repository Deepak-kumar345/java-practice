package basic;
import java.util.*;

public class CheckThreeNumEqual {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int no1 = s.nextInt();
        System.out.print("Enter the 2nd number: ");
        int no2 = s.nextInt();
        System.out.print("Enter the 3rd number: ");
        int no3 = s.nextInt();
        if(no1 == no2 && no1 == no3){
            System.out.println("all is equal");
        }else {
            System.out.println("not equal all");
        }

    }
}

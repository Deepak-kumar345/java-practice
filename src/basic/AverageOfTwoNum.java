package basic;
import java.util.*;

public class AverageOfTwoNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();
        int aver = (n1 + n2)/2;
        System.out.println("average of two number = "+ aver);

    }
}

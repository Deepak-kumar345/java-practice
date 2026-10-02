package basic;
import java.util.*;

public class AverageofThreenumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        float a = s.nextFloat();
        System.out.print("Enter the second Number: ");
        float b = s.nextFloat();
        System.out.print("Enter the third Number: ");
        float c = s.nextFloat();

        float aver = (a + b + c)/3;
        System.out.println("Average = "+ aver);

    }
}

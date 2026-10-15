package basic;
import java.util.*;

public class OneToNSumPrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = s.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= x){
            System.out.println(i);
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = "+ sum);
    }

    }

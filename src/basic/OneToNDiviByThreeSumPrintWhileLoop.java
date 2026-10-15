package basic;
import java.util.*;

public class OneToNDiviByThreeSumPrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        int sum = 0;
        int i =1;
        while (i <= a){
            if (i %3== 0){
                System.out.println(i);
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum ="+ sum);
    }
}

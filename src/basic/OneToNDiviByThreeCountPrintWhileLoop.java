package basic;
import java.util.*;

public class OneToNDiviByThreeCountPrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        int count = 0;
        int i = 1;
        while (i <=a ){
            if (i %3 == 0){
                System.out.println(i);
                count = count + 1;
            }
            i++;
        }
        System.out.println("Total = "+ count);
    }
}

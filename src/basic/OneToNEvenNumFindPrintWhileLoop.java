package basic;
import java.util.*;

public class OneToNEvenNumFindPrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = s.nextInt();
        int count = 0;
        int i = 1;
        while (i <= x){
            if (i %2 ==0){
                System.out.println(i);
                count = count + 1;
            }
            i++;
        }
        System.out.println("Total Even Number = "+ count);
    }
}

package basic;
import java.util.*;

public class OneToNSquarePrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        int i = 1;
        while (i <= a){
            System.out.println(i * i);
            i++;
        }
    }
}

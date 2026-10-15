package basic;
import java.util.*;

public class OneToNProductPrintWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = s.nextInt();
        int mul = 1;
        int i = 1;
        while (i <= x){
            mul = mul * i;
            i++;

        }
        System.out.println("Product = "+ mul);
    }
}

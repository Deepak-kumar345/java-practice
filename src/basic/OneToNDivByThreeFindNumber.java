package basic;
import java.util.*;

public class OneToNDivByThreeFindNumber {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.print("Enter the number: ");
        int a = s.nextInt();
        int count = 0;
        for (int i=0; i<=a; i++){
            if (i%3 == 0){
                  count = count + 1;
            }
        }
       System.out.println("Count = " + count);
    }
}

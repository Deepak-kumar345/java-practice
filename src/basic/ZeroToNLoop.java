package basic;
import java.util.*;

public class ZeroToNLoop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
}

package basic;
import java.util.*;

public class TrafficSignal {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the color: ");
       int color = s.next().charAt(0);
       if(color == 'R'){
           System.out.println("Stop");
       } else if (color == 'Y') {
           System.out.println("Ready");
       } else if (color == 'G') {
           System.out.println("Go");
       }else {
           System.out.println("Some Rest");
       }
   }
}

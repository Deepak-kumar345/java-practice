package basic;
import java.util.*;

public class VoteEligiblity {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = s.nextInt();
        if(age >= 18){
            System.out.println("You are Eligible");
        }else {
            System.out.println("You are not Eligible");
        }
    }

}

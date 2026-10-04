package basic;
import java.util.*;

public class CheckAgeCategory {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = s.nextInt();
        if (age < 13){
            System.out.println("Child");
        } else if (age > 13 && age < 20) {
            System.out.println("Teenager");
        } else if (age > 20 && age < 60) {
            System.out.println("Adult");
        } else if (age > 60) {
            System.out.println("Senior Citizen");
            
        }else {
            System.out.println("oky");
        }
    }
}

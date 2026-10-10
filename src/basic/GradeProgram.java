package basic;
import java.util.*;

public class GradeProgram {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        int grade = s.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Again Test");
        }
    }
}

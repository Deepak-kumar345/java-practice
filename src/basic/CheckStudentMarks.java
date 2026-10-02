package basic;
import java.util.*;

public class CheckStudentMarks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks  = s.nextInt();
        if(marks >= 75){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}

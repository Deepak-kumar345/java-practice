package basic;
import java.sql.SQLOutput;
import java.util.*;

public class CheckGradeMarks {
      public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          System.out.print("Enter the marks: ");
          int marks = s.nextInt();
          if(marks > 90){
              System.out.println("Grade 'A'");
          } else if (marks > 75 && marks < 90) {
              System.out.println("Grade 'B'");
          } else if (marks > 60 && marks < 75) {
              System.out.println("Grade 'C'");
          } else if (marks > 40 && marks < 60) {
              System.out.println("Grade 'D'");
          } else {
              System.out.println("Fail");
          }
      }
}

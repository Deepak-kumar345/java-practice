package basic;
import java.util.*;

public class CalculatorProgram {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();
        System.out.print("Enter the operator(+,-,*,/,%) :");
        int cal = s.nextInt();
        switch (cal){
            case 1:
                System.out.println("Rsult = "+ (a + b));
                break;
            case 2:
                System.out.println("Result = "+ (a - b));
                break;
            case 3:
                System.out.println("Result = "+ (a * b));
                break;
            case 4:
                System.out.println("Result = "+ (a / b));
                break;
            case 5:
                System.out.println("Result = "+ (a % b));
                break;
            default:
                System.out.println("invalid input");
        }
    }
}

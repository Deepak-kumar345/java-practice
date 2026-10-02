package basic;

import java.util.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        int c = s.nextInt();
        int cel = (c * 9/5) + 32;
        System.out.println("Fahrenheit = "+ cel + "°F");
    }
}

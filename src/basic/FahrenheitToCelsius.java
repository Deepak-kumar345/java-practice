package basic;
import java.util.*;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        int F = s.nextInt();
        int fahrenheit = (F - 32) * 5/9;
        System.out.println("Celcius = " + fahrenheit + "°C");

    }
}
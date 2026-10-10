package basic;
import java.util.*;

public class LanguageSelector {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Lang = s.nextInt();
        if(Lang == 1){
            System.out.println("Hindi");
        } else if (Lang == 2) {
            System.out.println("English");
        } else if (Lang == 3) {
            System.out.println("French");
        } else if (Lang == 4) {
            System.out.println("Spanish");
        }else {
            System.out.println("No Select Correct Language");
        }
    }
}
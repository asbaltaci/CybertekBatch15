package day11;

import java.util.Scanner;

public class If_String_Equality {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a name!");
        String myStr = scanner.next();

        if (myStr.equals("Java" )) {
            System.out.println(" Correct Word!!");
        } else if (myStr.equals("Cava")) {
            System.out.println("Pumpkin");
        }
        else {
            System.out.println("Not JAVA nor Pumpkin");
        }




    }
}

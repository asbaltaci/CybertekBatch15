package practises;

import java.util.Scanner;

public class Repl59 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter full name:");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("Max Payne") || (input.equalsIgnoreCase("Alan Wake"))) {
            System.out.println("User found!");
        }
        else {
            System.out.println("User not found!");
        }


    }
}

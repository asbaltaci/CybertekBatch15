package day17;

import day3.EscapeCharacter;

import java.util.Scanner;

public class NamePrinterWhileLoopReverse {
    public static void main(String[] args) {
                     //012345678


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name!!");
        String name = scan.nextLine();

        int x = name.length()-1; //index  = count -1

        while (x >= 0) {
            System.out.println(name.charAt(x));
            --x;
        }
    }

}
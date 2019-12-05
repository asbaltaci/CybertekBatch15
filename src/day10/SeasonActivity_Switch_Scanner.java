package day10;

import java.util.Scanner;

public class SeasonActivity_Switch_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, what is the season?");

        String season = scan.next();


        switch (season) {

            case "Spring":
                System.out.println("I celebrate Easter with my family");
                break;
            case "Summer":
                System.out.println("I go on vacation to Hawaii");
                break;
            case "Fall":
                System.out.println("Looking forward to do some shopping on Black Friday");
                break;
            case "Winter":
                System.out.println("I go on winter sleep");
                break;
            /*default:
                System.out.println("Invalid Season!!");
                break;
                no need here!!!
             */


        }
    }
}

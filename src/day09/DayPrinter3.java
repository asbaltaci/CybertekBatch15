package day09;

import java.util.Scanner;

public class DayPrinter3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayCode = 9;
        switch (dayCode) {
            case (1):
                System.out.println("Today is Monday");
                break;
            case (2):
                System.out.println("Today is Tuesday");
                break;
            case (3):
                System.out.println("Today is Wednesday");
                break;
            case (4):
                System.out.println("Today is Thursday");
                break;
            case (5):
                System.out.println("Today is Friday");
                break;
            case (6):
                System.out.println("Today is Saturday");
                break;
            case (7):
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("It is an invalid day!");



        }
    }
}